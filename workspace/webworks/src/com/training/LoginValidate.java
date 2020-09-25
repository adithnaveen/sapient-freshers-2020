package com.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.bean.User;

@WebServlet("/login")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");

		User user = makeUser(request); 
		
		if(new com.training.bl.LoginValidate().validate(user)) {
			response.getWriter().print("Welcome User " + user.getUserName());
		}else {
			response.getWriter().print("Sorry invalid Credentials:  " + user.getUserName());
		}
	}

	
	private User makeUser(HttpServletRequest request) {
		User user  = new User();
		user.setUserName(request.getParameter("uname"));
		user.setPassword(request.getParameter("pwd"));
		return user;
	}
	
} 














