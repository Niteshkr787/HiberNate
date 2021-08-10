package com.Asso.O;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class CreateData 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory bs = new Configuration().configure().buildSessionFactory();
             Session session = bs.openSession();
             Transaction tx = session.beginTransaction();
            //Saving Both Customer And Address Data into database
            
             Address address = new Address("Sec-3", "Noida1");
             session.save(address);
            Employee employee = new Employee("Nitesh1", "N1@gmail.com", address);
            session.save(employee);
            tx.commit();
            session.close();
           bs.close();
             
       
        
    }
}
