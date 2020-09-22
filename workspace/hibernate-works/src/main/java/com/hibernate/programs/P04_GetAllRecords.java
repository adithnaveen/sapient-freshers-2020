package com.hibernate.programs;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.hibernate.entity.Person;
import com.hibernate.util.HibernateUtil;

public class P04_GetAllRecords {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
//		 byHQL(session);
		
		 Criteria criteria = session.createCriteria(Person.class); 
		 criteria.add(Restrictions.ge("age", 21)); 
//		 criteria.add(Restrictions.ilike("name", "%peter")); 
		 
		 List list = criteria.list(); 
		 list.forEach(System.out :: println);
	}

	private static void byHQL(Session session) {
		List list = session.createQuery("from com.hibernate.entity.Person")
			.list(); 
		
		list.forEach(System.out :: println);
	}
}
