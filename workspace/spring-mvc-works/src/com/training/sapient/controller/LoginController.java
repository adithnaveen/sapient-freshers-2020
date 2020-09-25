package com.training.sapient.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="loginvalidate.html", method=RequestMethod.GET)
	public  ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response){
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("pass");
		
		if(name.equals("naveen") && pwd.equals("india")){
			String msg = "Hello " + name;
			return new ModelAndView("loginsuccesspage", "message", msg);
		} 
		
		return new ModelAndView("loginerrorpage", "message", "Sorry invalid credentials");
		
	}
	
	@RequestMapping("loginpage.html")
	public ModelAndView showLoginPage(){
		return new ModelAndView("LoginPage");
	}
}
