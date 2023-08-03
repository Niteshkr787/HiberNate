package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
     Session s=factory.openSession();
        Question q3=new Question();
        q3.setQuestionId(345);
        q3.setQuestion("What is Cascading");
  
        Answer a1=new Answer(234 ,"In hibernate it is impotance");
        Answer a2=new Answer(235 ,"Second answer");
        Answer a3=new Answer(236 ,"Third Answer");
         List<Answer> list=new ArrayList<Answer>();
               list.add(a1);
               list.add(a2);
               list.add(a3);
              q3.setAnswers(list);
               Transaction tx=s.beginTransaction();
               s.save(q3);
               s.save(a1);
               s.save(a2);
               s.save(a3);
               tx.commit();
               System.out.println("q3");
                  
                 s.close();
                factory.close();
}
}
