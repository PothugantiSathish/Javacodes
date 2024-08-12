package com.food.relation.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CandidateCourseController {

	public static void main(String[] args) {
    Configuration con=new Configuration().configure().addAnnotatedClass(Condidate.class).addAnnotatedClass(Course.class);
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Condidate candidate=new Condidate();
		candidate.setId(1);
		candidate.setName("sathish");
		
		Course course1=new Course();
		course1.setId(2001);
		course1.setName("Java");
		
		course1.setCondidate(candidate);
		
		Course course2=new Course();
		course2.setId(2002);
		course2.setName("Python");
		
		course2.setCondidate(candidate);
		
		Course course3=new Course();   
		
		course3.setId(2003);
		course3.setName("SQL");
		
		course3.setCondidate(candidate);
		
		//Independent entity should be saved first
		session.persist(candidate);
		session.persist(course1);
		session.persist(course2);
		session.persist(course3);
		tx.commit();
		
		
		
		
		
		

	}

}
                             