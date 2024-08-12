package com.relation.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentlaptopController {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure().addAnnotatedClass(StudentDto.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		StudentDto sd=new StudentDto();
		sd.setId(1);
		sd.setName("sathish");
		
		Laptop lp=new Laptop();
		lp.setLap_id(100);
		lp.setLap_name("hp");
		
		sd.setLaptop(lp);  //this column is refer as a foregn key column
		                   //column in student table.
		ses.persist(lp); //independent table saved 1st
		                 //after saving the laptop table we have to save student table
	 //ses.persist(sd);
	// tr.commit();
		sd=ses.get(StudentDto.class, 1);
		System.out.println(sd);
		System.out.println("---------------========");
		System.out.println(sd.getLaptop());

	}

}
