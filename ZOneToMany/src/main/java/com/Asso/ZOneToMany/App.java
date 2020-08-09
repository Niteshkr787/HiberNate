package com.Asso.ZOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			//Create Customer .....
			
			Customer cust = new Customer();
			cust.setcId(101);
			cust.setcName("PaswanJi");
			cust.setcCity("Patna");

			Customer cust1 = new Customer();
			cust.setcId(102);
			cust.setcName("DubeyJi");
			cust.setcCity("Madhubani");
			
	       //Create order 1.....		
			Order or = new Order();
			or.setoId(111);
			or.setoName("Flipkart");
			or.setoAddress("Patna");
			or.setCustomer(cust1);
            
			//create order 2
			Order or1 = new Order();
			or1.setoId(112);
			or1.setoName("Amazon");
			or1.setoAddress("Motohari");
			or1.setCustomer(cust1);
            
			//create order 3
			Order or2 = new Order();
			or2.setoId(113);
			or2.setoName("Mintra");
			or2.setoAddress("Hajipur");
			or2.setCustomer(cust);

			List<Order> list = new ArrayList<Order>();
			list.add(or);
			list.add(or1);
			list.add(or2);
			
			List<Order> list1 = new ArrayList<Order>();
			list.add(or);
			list.add(or1);

			cust.setOrder(list);
            cust.setOrder(list1);
			// Saving Data to database
			session.save(cust);
			session.save(or);
			session.save(or1);
			session.save(or2);
			session.save(cust1);
			transaction.commit();
			session.close();
			sessionFactory.close();

		} catch (Exception e) {
			System.out.println(e);
		} finally {

		}

	}
}
