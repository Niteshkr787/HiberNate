package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      
	//Creating Question 
	Question q1=new Question();
	
	q1.setQuestionId(12167);
	q1.setQuestion("What is java ?");
	//creating Answer...
	Answer ans=new Answer();
	ans.setAnswerId(3436);
	ans.setAnswer("Java Is programming Language");
	ans.setQuestion(q1);
    q1.setAnswer(ans);
    
    //Creating Second Question 
   Question q2=new Question();
	
	q2.setQuestionId(2427);
	q2.setQuestion("What is Collection FrameWork ?");
	//creating Answer...
	Answer ans1=new Answer();
	ans1.setAnswerId(3446);
	ans1.setAnswer("Api to work wth obj in java ");
  ans1.setQuestion(q2);
    q2.setAnswer(ans1);
    
    
    
    //session...
    Session s=factory.openSession();
    Transaction tx =s.beginTransaction();
//save..........!
    s.save(q1);
    s.save(q2);
    s.save(ans);
    s.save(ans1);
    tx.commit(); 
    //Fatching Data.......?
//    Question ques=(Question)s.get(Question.class, 242);
//     System.out.println(ques.getQuestion());
//     System.out.println(ques.getAnswer().getAnswer());
//     System.out.println(ques.getAnswer());
//     System.out.println();
    factory.close();
}
}
