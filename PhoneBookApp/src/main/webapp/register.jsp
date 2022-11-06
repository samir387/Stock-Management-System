<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>

<%@include file="component/allcss.jsp"%>
</head>
<body style="background-color: #c9f0ec">
	<%@include file="component/navbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
					<h4 class="text-center text-success">Registration Page</h4>
					<%
					String sucssMsg=(String)session.getAttribute("sucssMsg");
					String errorMsg=(String)session.getAttribute("errorMsg");
					
					if(sucssMsg!=null){
						%>
						   <p class="text-success text-center"><%=sucssMsg %></p>
					    <%	
					    session.removeAttribute("sucssMsg");
					}
					if(errorMsg!=null){			
						%>
						   <p class="text-danger  text-center "><%=errorMsg %></p>
					    <%	
					    session.removeAttribute("errorMsg");
					}	
					 %>
					
			
					<form action="register" method="post">

						<div class="form-group">
								<label for="exampleInputEmail1">Enter Name</label> <input name="name"
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
								
							</div>
						
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input name="email"
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" >
								
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input name="password"
									type="password" class="form-control" id="exampleInputPassword1">
							</div>
							<div class="text-center mt-2">
							<button type="submit" class="btn btn-primary">Register</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>
<div style="margin-top: 250px">
<%@include file="component/footer.jsp" %>
</div>
</body>
</html>