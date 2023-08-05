package CRUDOperationDemo.com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/*//Find Multiple data from Databae with the help of HQL
		 * String q1 = "from Employee"; Query query = session.createQuery(q1);
		 * 
		 * // Object result = query.uniqueResult(); // System.out.println(result);
		 * 
		 * List list = query.list(); list.stream().forEach(c ->
		 * System.out.println(c.toString()));
		 */
		
		//Find unique Result from employee with help of HQl
//		 String  q2="from Employee where empName=:x";
//		 Query qq = session.createQuery(q2);
//		 Query setParameter = qq.setParameter("x", "Manish");
//		 Object result = setParameter.uniqueResult();
//		 
//		 System.out.println(result);
		        
		// Update Query...From HQL
//		Query q3 = session.createQuery("update Employee set empSalary=:c where empName=:n");
//		   q3.setParameter("c", 90000);
//		   q3.setParameter("n", "Manish");
//		   Double rr = (double) q3.executeUpdate();
//		   System.out.println(rr);
		   
		//Delete Query 
//	 	Query q4 = session.createQuery("delete from employee where empNo=:c");
//	 	Query stp = q4.setParameter("c", 4);
//	 	     int rrrr = stp.executeUpdate();
//	 	     System.out.println(rrrr);
	 	
		
		
		
		
	
		tx.commit();
		session.close();
		factory.close();
	}
}
