package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Connection.DbConnect;
import com.DAO.UserDAO;
import com.Entity.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	String name=req.getParameter("name");
    	String email=req.getParameter("email");
    	String password=req.getParameter("password");
    	
    	User u=new User(name,email,password);
    	
    	UserDAO dao=new UserDAO(DbConnect.getConn());
    	boolean f=dao.userRegister(u);
    	
    	HttpSession session=req.getSession();
    	
    	if(f) {
    		session.setAttribute("sucssMsg", "user register succesful");
    		resp.sendRedirect("register.jsp");
    	
    	}
    	else {
    		session.setAttribute("errorMsg", "Something Went Wrong on Server");
    		resp.sendRedirect("register.jsp");
    	}
    }
}
