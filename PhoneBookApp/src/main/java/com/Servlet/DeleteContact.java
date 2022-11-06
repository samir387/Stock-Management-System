package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Connection.DbConnect;
import com.DAO.ContactDAO;

@WebServlet("/delete")
public class DeleteContact extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		int cid=Integer.parseInt(req.getParameter("cid"));
		
ContactDAO dao=new ContactDAO(DbConnect.getConn());
 		
        HttpSession session =req.getSession();
		
	    boolean f=dao.deleteContactById(cid);
		
		if(f)
		{
			session.setAttribute("succMsg", "Contact Delete Successfully");
			resp.sendRedirect("viewContact.jsp");
		}
		else
		{
			session.setAttribute("failedMsg", "Something Went Wrong on Server");
			resp.sendRedirect("editcontact.jsp?cid="+cid);
		}
	}

}
