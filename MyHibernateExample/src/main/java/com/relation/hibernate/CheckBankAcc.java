package com.relation.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CheckBankAcc {

	public static void main(String[] args) {
		User_acc u1=new User_acc();
		u1.setId(104);
		u1.setName("sathish");
		
		User_acc u2=new User_acc();
		u2.setId(105);
		u2.setName("Chaithu");
		
		User_acc u3=new User_acc();
		u3.setId(106);
		u3.setName("Anil");
		
		Bank b1=new Bank();
		b1.setId(123);
		b1.setBankName("Dacota bank");
		
		Bank b2=new Bank();
		b2.setId(124);
		b2.setBankName("SBI bank");
		
		Bank b3=new Bank();
		b3.setId(125);
		b3.setBankName("ICIC bank");
		
		List<Bank> banks=new ArrayList<Bank>();
		banks.add(b1);
		banks.add(b2);
		banks.add(b3);
		
		u1.setBank(banks);
		u2.setBank(banks);
		u3.setBank(banks);
		
		List<User_acc> users=new ArrayList<User_acc>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		b1.setUsers(users);
		b2.setUsers(users);
		b3.setUsers(users);
		
		
       Configuration con=new Configuration().configure().addAnnotatedClass(User_acc.class).addAnnotatedClass(Bank.class);
		
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		
		Transaction tx=session.getTransaction();
		tx.begin();
		
		 
		 session.save(u1);
		 session.save(u2);
		 session.save(u3);
		 session.save(b1);
		 session.save(b2);
		 session.save(b3);
		  
		 tx.commit();
		
	}

}
