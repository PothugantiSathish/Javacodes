package com.food.relation.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FoodOrderCustomerController {

	public static void main(String[] args) {
       Configuration con=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(FoodOrder.class);
		
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		
		Session ses1=sf.openSession();
		Customer c1=ses1.get(Customer.class,101);
		System.out.println(c1);
		ses1.close();
		Session ses2=sf.openSession();
		Customer c2=ses2.get(Customer.class,101);
		System.out.println(c2);
		
		Transaction tr=ses.beginTransaction();
		
		Customer customer=new Customer();
		customer.setId(101);
		customer.setCustomer("sathish");
		customer.setMobno(9010549358L);
		
		FoodOrder order=new FoodOrder();
		order.setId(201);
		order.setOrderType("single meal");
		order.setNumOfItems(2);
		
		//setting order to customer
		customer.setFoodOrder(order);
		ses.persist(order);
		ses.persist(customer);
		tr.commit();
		
		
		
		
	}

}
