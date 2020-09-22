package com.hibernate.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Person;
import com.hibernate.util.HibernateUtil;

public class P02_GetPersonData {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory(); 
		
		Session session = sf.openSession(); 
		
		Person p1 = (Person) session.get(Person.class, 102); 
		
		System.out.println(p1);
		session.close(); 
		sf.close(); 
	}
}
