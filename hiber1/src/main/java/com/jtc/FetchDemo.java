package com.jtc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
public static void main(String[] args) {
	//Get() and Load () exmp
	
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
          Session  session=factory.openSession();
         //get-student : 104
          Student student =(Student)session.load(Student.class, 104);
          Student student1 =(Student)session.load(Student.class, 104);
          System.out.println(student1.getName());//when we use then ye quary pass krega warna load kitna vi obj bna le kuchh nhi prnt hga
          
       // System.out.println(student);
//        
//        Address ad=session.get(Address.class, 2);// 2 ke jagah pe o vlaue jo db me nhi h toh null aayegi becoz get hai 
//        //System.out.println(ad);
//        System.out.println(ad.getStreet() +":"+ ad.getCity());
//        
//        
//        //Dubara agar call krege toh hiber db ko hit nhi krega 
//        Address ad1=session.get(Address.class, 2);
//        System.out.println(ad.getStreet() +":"+ ad.getCity());
        
        session.close();   
        factory.close();
          
}
}
