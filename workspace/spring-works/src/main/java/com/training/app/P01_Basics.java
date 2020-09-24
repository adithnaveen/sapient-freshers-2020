package com.training.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig1;
import com.training.dao.DummyDao;
import com.training.dao.IDatabase;
import com.training.dao.MySQLDao;

public class P01_Basics {
	public static void main(String[] args) {
		// out dependency 
		IDatabase dao; 
		
		// variable representing the spring container 
		AnnotationConfigApplicationContext ctx; 
		
		// the the objects of the appconfig1 will be loaded to the container 
		ctx = new AnnotationConfigApplicationContext(AppConfig1.class); 
		
		System.out.println("---------------------------------------------------");
//		dao= (IDatabase) ctx.getBean("dummyDao"); 
		dao = ctx.getBean(DummyDao.class); 
		System.out.println("dummy count -> " +dao.getCount());  
		
		DummyDao dao2 = ctx.getBean(DummyDao.class); 
		
		System.out.println(dao.hashCode());
		System.out.println(dao2.hashCode());
		
		
		MySQLDao dao1 = ctx.getBean(MySQLDao.class); 
		System.out.println("mysql count -> "+dao1.getCount());
		
	}
}
