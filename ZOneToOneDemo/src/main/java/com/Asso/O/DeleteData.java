package com.Asso.O;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	  Employee load = session.load(Employee.class, 1);
	  System.out.println(load);
	  session.delete(load);
	  transaction.commit();
	  session.close();
	  sessionFactory.close();
}
}
