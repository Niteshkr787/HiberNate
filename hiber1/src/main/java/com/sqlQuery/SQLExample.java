package com.sqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.jtc.Student;

public class SQLExample {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    Session   s=factory.openSession();
    
    //This is Sql Quary
    
	  String q="select * from student";
	  NativeQuery nq= s.createSQLQuery(q);
	  List<Object []> list=nq.list();
	 
	  for(Object [] student : list) {
		 // System.out.println(Arrays.toString(student));
	       System.out.println(student[4] + ":"+ student[3]);
	  
	  
	  }
	     
	     
	     
	     
	     s.close();
	factory.close();
}
}
