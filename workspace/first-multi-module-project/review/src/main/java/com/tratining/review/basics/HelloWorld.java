package com.tratining.review.basics;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	
	
	static Logger logger = LoggerFactory.getLogger(HelloWorld.class); 
	
	
	public static void main(String[] args) {
		BasicConfigurator.configure(); 
		logger.info("Hi This is from info from reveiw ");
		logger.debug("This is from Debug from review");
	}
}
