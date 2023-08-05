package CRUDOperationDemo.com;

import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadingData_From_DataBase {
public static void main(String[] args) {
	System.out.println("Record fatching From database");
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	 Transaction tx=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Inter Employee No. : ");
	Employee empy = session.load(Employee.class, sc.nextInt());
	 
	System.out.println("Employee Number is "+ empy.getEmpNo());
	System.out.println("Employee Name is "+ empy.getEmpName());
	System.out.println("Employee Salary is "+ empy.getEmpSalary());
	
	
}
}
