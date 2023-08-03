package com.pegination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jtc.Student;

@SuppressWarnings("deprecation")
public class HQLpegination {
 public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  Session s=factory.openSession();
	
	 @SuppressWarnings("unchecked")
	Query<Student> quary=s.createQuery("from Student");
	   //implementation pagination using hibernate
	 
	 quary.setFirstResult(0);
	 quary.setMaxResults(5);
	 
	     List<Student> list2=quary.list();
	        //list.stream().forEach(System.out::println);
	for(Student st1: list2) {
		System.out.println(st1.getId() + ":"+st1.getName()+":"+st1.getCity());
	} 
	
	s.close();
	factory.close();
}
}
