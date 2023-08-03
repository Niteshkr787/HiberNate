package com.Hql;

import java.util.Arrays;
import java.util.List;
 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jtc.Student;

public class HQLExample {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	  
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session s=factory.openSession();
     
//HQL 
//syntax:
	String quary="from Student";
	String quary1="from Student where city= 'Dhaka'";
	String quary2="from Student where city= :x ";
	     //From Eliyash concept
	//String quary3="from Student where s.city= :x and s.name=:n";
    Query q=s.createQuery(quary2);
      
     q.setParameter("x", "Dhaka");
     //q.setParameter("n", "Ravi");
   //single--(Unique result)
   //Multiple --list
    //q.uniqueResult()
      List<Student>  list=q.list(); 
    
      for(Student st2: list) {
    	  System.out.println(st2.getName()+":"+st2.getCerti().getCourse());
      }
System.out.println("*************************************\n");
//DELETE QUARY......!
 Transaction tx=s.beginTransaction();   
//Query q2=s.createQuery("delete from Student s where s.city=:c");            
//      q2.setParameter("c", "bihar");
//      
//      int r=q2.executeUpdate();
//      System.out.println("Deleted:");
//      System.out.println(r);
//       
      //UPDATE QUARY.....!
     Query q2=s.createQuery("update Student set city=:c where name=:n");
         q2.setParameter("c", "Pakistan");
         q2.setParameter("n", "Ravi");
        int r=q2.executeUpdate();
    System.out.println(r +"object Updatedd");
    tx.commit();
    
    //How To execute join Quarry.......!       
     Query q3=s.createQuery("select q.question , q.questionId , a.answer  from Question as q INNER JOIN q.answer as a");   
        List<Object []> list3=q3.getResultList();
        for(Object[] arr: list3) {
        	System.out.println(Arrays.toString(arr));
        }
         
         
         
             
              s.close();
            factory.close();
}
}
