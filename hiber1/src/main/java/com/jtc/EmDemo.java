package com.jtc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     
	//First Student....
	Student st1=new Student();
	st1.setId(107);
	st1.setName("Raushan");
	st1.setCity("Delhi1");
	
	Certificate certy=new Certificate();
	certy.setCourse("JAVA");
	certy.setDuration("2-month");
	
	st1.setCerti(certy);
	
	
	//2.Second Student....
	
	Student st2=new Student();
	st2.setId(109);
	st2.setName("Ravi");
	st2.setCity("Dhaka");
    Certificate certy1=new Certificate();
	certy1.setCourse("PHYTHON");
	certy1.setDuration("2-month");
	
	st2.setCerti(certy1);
//..................................................
	Session s=factory.openSession();
    Transaction	tx=s.beginTransaction();
    //Saving Object...
     s.save(st1);
     s.save(st2);
    

	tx.commit();
	s.close();
	factory.close();
	

}
}
