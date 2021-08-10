package com.Asso.O;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
public static void main(String[] args) {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	  Employee load = session.load(Employee.class, 11);
	  System.out.println(load);
	  
       load.seteName("Updesh");	  
	  session.update(load);
	    
	  transaction.commit();
	  session.close();
	  sessionFactory.close();
	  
	  
	 
}
}
