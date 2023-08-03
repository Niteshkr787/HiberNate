package com.jtc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
public static void main(String[] args) {
//practical of hibernate object States:
//Transient
//Persistent
//Datached
//Removed
	System.out.println("Exmple:");
	SessionFactory f=new Configuration().configure().buildSessionFactory();
	
//Creating Student Object.....
	Student st=new Student();
	st.setId(101);
	st.setName("pradeep");
	st.setCity("MP");
	st.setCerti(new Certificate("Java Hibernate Course", "2-Month"));
//student Transient..!
	  Session s=f.openSession();
	  Transaction tx=s.beginTransaction();
	  s.save(st);
	  
//student : Persistent state Me -- Avi session and Databases dono ke sath Associate h
	  st.setName("John");//Avi change ho jayega db me 
	  
	  tx.commit();
	  s.close();
	  
//Detached state me ab DB me name change nhi hoaga 
	  st.setName("SOm");
	  System.out.println(st);
	  f.close();
}
}
