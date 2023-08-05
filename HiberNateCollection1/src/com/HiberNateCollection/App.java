package com.HiberNateCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	     Session session = factory.openSession();
	    Transaction transaction = session.beginTransaction();
	    String course[]= {"String"  , "Java" , "Phython" , "Hibernate" };
	    
	    List<String> skills=new ArrayList<String>();
	    skills.add("java8");
	    skills.add("Servlet");
	    skills.add("JSP");
	    skills.add(".Nate");
	    
	    List<Integer> marks=new ArrayList();
	    marks.add(80);
	    marks.add(70);
	    marks.add(60);
	    marks.add(30);
	    
	    Set<String> interview=new HashSet<String>();
	    interview.add("Infosis");
	    interview.add("Tcs");
	    interview.add("Google");
        interview.add("Amazon");
        
        Map<String, Integer> refs=new HashMap<String, Integer>();
               refs.put("AB", 11);
               refs.put("BB", 22);
               refs.put("CC", 33);
               refs.put("DD", 44);
               Student st=new Student();
               st.setSname("Krisha_JI");
               st.setSemail("niteshkr.gupta787@gmail.com");
               st.setSphone(892233);
               st.setCourses(course);
               st.setSkills(skills);
               st.setMarks(marks);
               st.setSinterview(interview);
               st.setRefs(refs);
               
               session.save(st);
               transaction.commit();
               factory.close();
               
}
}
