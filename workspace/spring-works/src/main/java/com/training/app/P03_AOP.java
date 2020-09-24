package com.training.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.AppConfig3;
import com.training.dao.DummyDao;
import com.training.dao.MySQLDao;

public class P03_AOP {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx =
				new AnnotationConfigApplicationContext(AppConfig3.class);

		System.out.println("----------------------------------");
		MySQLDao mysqlBean = ctx.getBean("mysqlDao", MySQLDao.class);
		
		System.out.println(mysqlBean.getCount());
		
		DummyDao dummyDao = ctx.getBean("dummyDao", DummyDao.class);
		System.out.println(dummyDao.getCount());
	}
}
