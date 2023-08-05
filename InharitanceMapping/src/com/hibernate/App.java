package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory factory = HiberNateUtil.getSessionFactory();
		     Session session = factory.openSession();
		     tx=session.beginTransaction();
		     
		   //1.Saving Student Record....
		     Student st=new Student("Manish", "Man@gmail.com", 1234);
		      session.save(st);
		      
		  //2.Saving CurrentStudent record....
		    CurrentStudent ct=new CurrentStudent("Seraj", "Seraj@gmail.com", 56757, 999.99, "2O'clock", "Vivek");
		    session.save(ct);
		    
		  //3.saving OldStudent record....
		    OldStudent os=new OldStudent("Rupesh", "Rupesh@gmail.com", 55776, 999.99, "Google", "rupesh4@gmail.com");
		    session.save(os);
		    
		 //4.saving WeekdayStudent record.....
		    WeekdayStudent ws=new WeekdayStudent("Vikash", "vkr@gmail.com", 7897, 9000, "5.0PM", "SOM", 2020, 65, "B.tech");
		    session.save(ws);
		 //5.saving Weekand Student record.....
		    WeekandStudent ww=new WeekandStudent("PdNand", "Pd@gmail.com", 9898, 666666, "8.45PM", "Amresh", 34343, "WebEarnSol", "PdWeb@gmail.com");
		    session.save(ww);
		    tx.commit();
		    session.close();
		    factory.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
