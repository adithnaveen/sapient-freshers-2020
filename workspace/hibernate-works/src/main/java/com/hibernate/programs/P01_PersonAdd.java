package com.hibernate.programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.entity.Person;
import com.hibernate.util.HibernateUtil;

public class P01_PersonAdd {
	public static void main(String[] args) throws ParseException {

		Person person = new Person();

		person.setId(104);
		person.setName("Ashotosh");
		person.setAge(20);
		person.setHeight(5.4);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		person.setBirthDate(sdf.parse("20-02-1990"));

		SessionFactory sf = HibernateUtil.getSessionFactory();
	
		Session session = sf.openSession();
		Transaction transaction = null;
		try {
			// to perform CRUD operations
			// 1. Begin the transaction
			transaction = session.beginTransaction();
			// 2. perform the transaction(INSERT/UPDATE/DELETE/SELECT)
			session.persist(person);
			// 3. try to commit
			transaction.commit();
			System.out.println("Data Stored... ");
		} catch (Exception e) {
			// 4. check if there is error if so rollback
			transaction.rollback();
		} finally {
			// 5. close
			session.close();
			sf.close();
		}

	}
}
