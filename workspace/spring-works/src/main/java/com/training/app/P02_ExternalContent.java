package com.training.app;

import java.sql.Connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig2;

public class P02_ExternalContent {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx =
					new AnnotationConfigApplicationContext(AppConfig2.class);

		System.out.println("---------------------------------------------------");
		
		Connection bean = ctx.getBean("getConnection", Connection.class);
		
	}
}
