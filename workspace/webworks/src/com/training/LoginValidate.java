package com.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/login")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd"); 
		response.setContentType("text/html");
		
		
		if(uname.equals("india") && pwd.equals("sapient")) {
			response.getWriter().print("Welcome User " + uname);
		}else  {
			response.getWriter().print("Sorry invalid Credentials:  " + uname);
			
		}
	}

}
