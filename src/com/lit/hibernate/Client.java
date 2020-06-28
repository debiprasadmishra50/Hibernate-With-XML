package com.lit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = new Student("Debi",9.7);
		session.save(s1);
		Student s2 = new Student("Prasad",8.7);
		session.save(s2);
		
		tx.commit();
	}
}
