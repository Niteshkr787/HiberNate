package com.jtc.HiberNate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
      
        Student student1 = new Student(111 , "NiteshGupta" , 829207 , "Chakia" , "Mehasi" , new Certificate());
         
        
        Certificate certificate = new Certificate();
            certificate.setCname("Matriculation");
            certificate.setDuration(1);
            certificate.setRollNo(19024);
           certificate.setCname("Intermediate");//Now here matriculation  replace with intermediate 
            
            student1.setCerti(certificate);
            
            Certificate certificate1 = new Certificate();
            certificate1.setCname("Java");
            certificate1.setDuration(2);
            certificate1.setRollNo(2022);
            
            student1.setCerti(certificate1);
        
       // Session session = factory.openSession();
       // Transaction tx = session.beginTransaction();
        
      
        //  session.save(student1);
          
        
        //  tx.commit();
      //  session.close();
    }
}
