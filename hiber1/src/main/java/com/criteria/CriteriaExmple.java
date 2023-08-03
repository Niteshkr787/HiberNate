package com.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jtc.Student;

public class CriteriaExmple {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	       Session session = factory.openSession();
	
	       Criteria s1=session.createCriteria(Student.class);
	             System.out.println(s1); 
	       
	       
	       
	        session.close();
	       factory.close();
}
}
