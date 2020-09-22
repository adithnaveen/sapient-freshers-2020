package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Person;

public class HibernateUtil {
	private HibernateUtil() {
	}

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			System.out.println("session factory null and creating..");
			Configuration cfg = new Configuration();
			cfg.configure();	// hibernate.cfg.xml(by default) 

			cfg.addAnnotatedClass(Person.class);
			sessionFactory = cfg.buildSessionFactory();
		}

		return sessionFactory;
	}

}
