package com.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init from servlet ");
	}

	 
	public void destroy() {
		System.out.println("Destroy in servlet... ");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("in service doGet");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome to Servlet @ " + new Date().toString() +"</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

}











