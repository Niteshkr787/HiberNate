package CRUDOperationDemo.com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete_Employee_Data {
public static void main(String[] args) {
	System.out.println("Delete Employee data");
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	//First Load the data From Databases And Delete It.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Inter Employee No. Which You Want to Delete");
	Employee empD = session.get(Employee.class, sc.nextInt());
	if(empD!=null) { 
	session.delete(empD);
	tx.commit();
	session.close();
	factory.close();
	System.out.println("You Employee Record is Delete Succfully");
	}else {
		System.out.println("Please Inter Your Correct Employee No.");
	}
	tx.commit();
	session.close();
	factory.close();
}
}
