package com.jtc;

import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 *
 *
 *
 */
public class App 
{
    public static void main( String[] args )  throws IOException
    {
        System.out.println( "project stated....." );

        
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory);
        Certificate cr = new Certificate("java", "1-year");   
        
        Student st=new Student();
        st.setId(105);
        st.setName("Nitesh");
        st.setCity("Mehasi");
        st.setId(105);
        st.setName("Nitesh2");
        st.setCity("Mehasi3");
        st.setCerti(cr);
        System.out.println(st);
        
//create student Address class object..........!
        
        Address ad=new Address();
        ad.setStreet("Street-1111111111111111");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(999.99);
        
//Reading Image...
        
        FileInputStream fis1=new FileInputStream("src/main/java/ma.jpg");
          byte[] data=new byte[fis1.available()];
          fis1.read(data);
          ad.setImage(data);
        
//save the student data
         Session session=factory.openSession();
         Transaction tx = session.beginTransaction();
        // session.save(st);
         session.save(ad);
         tx.commit();
         session.close(); 
       System.out.println("Done....");
    }
}
