package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client1 {
	public static void main(String[] args) {
		try {
			Transaction txs=null;
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session  session=sf.openSession();
		    txs=session.beginTransaction();
			CustomerAnno cus=new CustomerAnno(104, "Niti" , "Niti.gupta787@gamail.com" , 8292 , "Bihar" , 999.99);
             System.out.println("testing save :"+ session.save(cus));
             txs.commit();
             session.close();
             System.out.println("Record Submited");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
