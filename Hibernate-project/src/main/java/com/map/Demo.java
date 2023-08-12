package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class Demo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		cfg.setProperty("hibernate.show_sql", "true");

		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java?");
		
		
		Answer answer = new Answer();
		answer.setAnswerId(242);
		answer.setAnswer("Java is programming language");
		q1.setAnswer(answer);
		
		
		Question q2 = new Question();
		q2.setQuestionId(1213);
		q2.setQuestion("What is collection?");
		
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("collection");
		q2.setAnswer(answer1);
		
		
		
		Session s = factory.openSession();
		org.hibernate.Transaction t = s.beginTransaction();
		
		
//		s.beginTransaction();
		
		s.save(q1);
		s.save(q2);
		s.save(answer);
		s.save(answer1);
		
		t.commit();
		
		
		Question newQuestion = (Question) s.get(Question.class, 1212);
		System.out.println(newQuestion.getQuestion());
		System.out.println(newQuestion.getAnswer().getAnswer());
//		s.beginTransaction().commit();
//		
		s.close();
		
		factory.close();
	}

	
	
}
