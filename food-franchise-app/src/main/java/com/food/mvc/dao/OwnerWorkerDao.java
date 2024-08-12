package com.food.mvc.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.food.mvc.model.Owner;
import com.food.mvc.model.Worker;

@Repository
public class OwnerWorkerDao {

	
	private Configuration con=new Configuration().configure().addAnnotatedClass(Owner.class).addAnnotatedClass(Worker.class);
	private SessionFactory factory=con.buildSessionFactory();
    private Session session=factory.openSession();
    private Transaction tx;
    
    public String saveOwner(Owner dto) {
    	tx=session.beginTransaction();
    	session.persist(dto);
    	tx.commit();
		return dto.getName()+"is saved successfully";
    	
    }
    
    public String saveWorker(Worker dto) {
		tx=session.beginTransaction();
    	session.persist(dto);
    	tx.commit();
		return dto.getName()+"is saved successfully";
    	
		
	}
    
    public Owner getOwner(int id) {
    	return session.get(Owner.class, id);
    }

	

	public Owner ownerLogin(String email, String password) {
		
		Owner obj;
		try {
			Query<Owner> q=session.createQuery("from Owner where email= :email and password= :password",Owner.class);
			q.setParameter("email", email);
			q.setParameter("password", password);
			obj=q.getSingleResult();
		}catch(Exception e) {
			return null;
		}
		
		return obj;
	}
}
