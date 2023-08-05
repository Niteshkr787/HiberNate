package com.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;



public class HiberNateUtil {
	
static SessionFactory sessionFactory=null;

static {
	try {
		Configuration cfg=new Configuration();
		Properties mypro=new Properties();
		mypro.put(Environment.DRIVER , "com.mysql.cj.jdbc.Driver");
		mypro.put(Environment.URL , "jdbc:mysql://localhost:3306/nitesh");
		mypro.put(Environment.USER , "root");
		mypro.put(Environment.PASS , "Nitesh");
		mypro.put(Environment.DIALECT , "org.hibernate.dialect.MySQL8Dialect");
		mypro.put(Environment.SHOW_SQL , "true");
		mypro.put(Environment.CURRENT_SESSION_CONTEXT_CLASS , "thread");
		mypro.put(Environment.HBM2DDL_AUTO , "update");
		cfg.setProperties(mypro);
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(CurrentStudent.class);
		cfg.addAnnotatedClass(OldStudent.class);
		cfg.addAnnotatedClass(WeekdayStudent.class);
		cfg.addAnnotatedClass(WeekandStudent.class);
		StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder();
	ServiceRegistry build = ssr.applySettings(cfg.getProperties()).build();
	     sessionFactory= cfg.buildSessionFactory(build);
		
	}catch(Exception e) {
		e.printStackTrace();
	}	
}

public static SessionFactory getSessionFactory() {
	return sessionFactory;
}
}
   

