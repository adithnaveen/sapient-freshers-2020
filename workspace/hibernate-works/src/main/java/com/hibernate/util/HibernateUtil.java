package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private HibernateUtil() {
	}

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();	// hibernate.cfg.xml(by default) 

			cfg.addAnnotatedClass(Object.class);

			sessionFactory = cfg.buildSessionFactory();

		}

		return sessionFactory;
	}

}
