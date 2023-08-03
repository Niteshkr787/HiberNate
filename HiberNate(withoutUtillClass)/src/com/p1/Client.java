package com.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Customer c=new Customer(101, "ram", "noida");
		Transaction tx=s.beginTransaction();
		s.save(c);
		tx.commit();
		s.close();
		sf.close();
	}
}
