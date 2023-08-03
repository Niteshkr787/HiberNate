package com.jtc.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
static SessionFactory factory=null;
static {
Configuration cfg=new Configuration();
cfg=cfg.configure("Hibernate.cfg.xml");
factory=cfg.buildSessionFactory();

}
public static SessionFactory getSessionFactory() {
	return factory;
}

}

