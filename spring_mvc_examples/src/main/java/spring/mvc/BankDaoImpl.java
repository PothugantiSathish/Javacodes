package spring.mvc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository //represent the Dao class or represent repository
public class BankDaoImpl implements BankRepository {//giving access to the database by using hibernate components.

	//declaring global variable
//	private SessionFactory factory; // it is url of the database connect the application
//	private Session session;//to provide crud operations performed
//	private Transaction tx;// safe transaction
	
	Configuration con=new Configuration().configure().addAnnotatedClass(BankUser.class);
	SessionFactory factory=con.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx;
	
	@Override
	public String saveUser(BankUser user) {
		 tx=session.beginTransaction();
		 session.save(user);
		 tx.commit();//permenant save the data
		
		return user.getName()+" is saved successfully";
	}

	@Override
	public BankUser getUser(int id) {
		
		return session.get(BankUser.class, id);
	}

	@Override
	public List<BankUser> getAll() {
		
//		Query<BankUser> q=session.createQuery("from BankUser",BankUser.class);
//		return q.list();
		
		return session.createQuery("from BankUser",BankUser.class).list();//gives the query object
	}

	@Override
	public String updateUser(BankUser user) {
		tx=session.beginTransaction();
		session.merge(user);
		tx.commit();
		return user.getName()+" is updated successfully";
	}

	@Override
	public String deleteUser(int id) {
		BankUser user=this.getUser(id);//we need to user object
		tx=session.beginTransaction();
		session.remove(user);
		tx.commit();
		return user.getName()+" is deleted successfully";
	}

}
