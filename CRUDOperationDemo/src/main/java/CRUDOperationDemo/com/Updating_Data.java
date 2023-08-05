package CRUDOperationDemo.com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updating_Data {
public static void main(String[] args) {
	System.out.println("Data Updating...");
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	//First Data Load and then Update
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Inter Your Employee No. to Update : ");
	  Employee empyU = session.get(Employee.class, sc.nextInt());
	  
	  if(empyU!=null) {
		  System.out.println("Inter New Salary to Update:");
		  empyU.setEmpSalary(sc.nextDouble());
		  session.update(empyU);
		  tx.commit();
		  session.close();
		  factory.close();
		  System.out.println("Your Record Update Succfully ");
	  }else {
		  System.out.println("Record Not found Please Inter Correct Employee No");
	  }
	
	
}
}
