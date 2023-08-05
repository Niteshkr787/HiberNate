package CRUDOperationDemo.com;

import java.util.Scanner;

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
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
          Session session = factory.openSession();
          Transaction tx =null;
          String choise="no";
          Scanner sc = new Scanner(System.in);
          do {
			tx=session.beginTransaction();
			Employee emp = new Employee();
			System.out.println("Inter Employee Number :");
			emp.setEmpNo(sc.nextInt());
			System.out.println("Inter Employee Name :");
			emp.setEmpName(sc.next());
			System.out.println("Inter Employee Salary :");
			emp.setEmpSalary(sc.nextDouble());
			//Saving Employee details into Databases.
			session.save(emp);
			tx.commit();
			
			System.out.println("One Record Insert Seccessfully ");
			System.out.println("Do You want to insert new Employee Record Y/N");
        	  choise=sc.next();
		} while (choise.equalsIgnoreCase("y")| choise.equalsIgnoreCase("Yes"));
			session.close();
			factory.close();
		
          
        
    }
}
