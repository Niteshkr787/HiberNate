package com.collection1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    Student s1=new Student();
	   // factory.openSession();
}
}
