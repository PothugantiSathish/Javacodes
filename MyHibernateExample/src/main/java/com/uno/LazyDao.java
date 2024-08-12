package com.uno;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LazyDao {
	private SessionFactory sf;
	private Session session;
	private Transaction tx;
	
	{
		
	Configuration con =new Configuration().configure().addAnnotatedClass(Lazyguy.class);
	sf=con.buildSessionFactory();
	session=sf.openSession();
	}
	
	public String saveLazy(Lazyguy dto) {
		tx=session.beginTransaction();
		session.persist(dto);
		tx.commit();
		return dto.getName()+"is saved successfully";
	}
	public List<Lazyguy> getAll() {
		return session.createQuery("from Lazyguy",Lazyguy.class)
		.list();
	}
	public Lazyguy getbyId(int id) {
		return session.get(Lazyguy.class,id);
	}
	
	public String updateLazy(Lazyguy dto) {
		tx=session.beginTransaction();
		session.remove(dto);
		tx.commit();
		return dto.getName()+"is updated succesfully";
	}
	
	
	public String deletelazy(int id) {
		
		tx=session.beginTransaction();
		Lazyguy dt= getbyId(id);
		session.remove(dt);
		tx.commit();
		return dt.getName()+"is deleted succesfully";
	}
	public Lazyguy getLazyguy(int id) {
		tx=session.beginTransaction();
		Lazyguy dt= getbyId(id);
		session.remove(dt);
		tx.commit();
		return dt;
		 
	}

}
