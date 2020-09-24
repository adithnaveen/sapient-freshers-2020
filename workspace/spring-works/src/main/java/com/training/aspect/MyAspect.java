package com.training.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* com.training.dao.*.get*())")
	public void logBefore(JoinPoint jp) {
		
		System.out.println("Generice Before : " + jp.getSignature().getName());
		System.out.println(Arrays.toString(jp.getArgs())); 
	}
	

//	@Before("execution(* com.training.dao.MySQLDao.get*())")
//	public void logBefore1(JoinPoint jp) {
//		System.out.println("Mysql Before : " + jp.getSignature().getName());
//	}
//	
//	
	@Around("execution(* com.training.dao.MySQLDao.get*())")
	public Object aroundMethodAspect(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before invoking method... ");
		Object[] args = pjp.getArgs(); 
		
		
		Object proceed = pjp.proceed(args);  
		
		
		
		System.out.println("after invoking method.. ");
		return proceed; 
	}
}
