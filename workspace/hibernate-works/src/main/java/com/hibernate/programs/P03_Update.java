package com.hibernate.programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.Person;
import com.hibernate.util.HibernateUtil;

public class P03_Update {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory(); 
		
		Session session = sf.openSession(); 
		
		Person p1 = (Person) session.get(Person.class, 102); 
		p1.setName("Mr. Harry Backer");
		
		session.beginTransaction(); 
		// persist
		session.merge(p1); 
		// saving the data here 
		session.getTransaction().commit(); 
		System.out.println("Updated... ");
	}
}
