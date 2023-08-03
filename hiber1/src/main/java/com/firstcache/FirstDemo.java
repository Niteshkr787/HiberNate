package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jtc.Student;

public class FirstDemo {
public static void main(String[] args) {
	SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
	    Session openSession = buildSessionFactory.openSession();
     //By default Enable......?
	      Student student = openSession.get(Student.class ,104);
            System.out.println(student.getCity());
	     System.out.println(student);
	     System.out.println("Working something");
	     Student student2 = openSession.get(Student.class ,104);
	     System.out.println(student2);
	    System.out.println( openSession.contains(student2));//true its means cach m/m me obj hai ye quaey pass nhi krega
	      openSession.close();
	      buildSessionFactory.close();
}
}
