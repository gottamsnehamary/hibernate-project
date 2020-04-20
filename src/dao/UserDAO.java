package dao;


import java.util.List;

import javax.persistence.EntityTransaction;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;

import utility.HibernateConnectionManager;

public class UserDAO implements UserDaoInterface {

	  SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();
	public boolean loginUser(User user) {
		
        Session session = this.sessionFactory.openSession();
	        Transaction tx = null;
	      
	        try {
	        	tx=session.getTransaction();
	            session.beginTransaction();
	    		Query query = session.createQuery("from User where email='"+user.getEmail()+"'"+"and password ='"+user.getPassword()+"'");
	    		List<User> users = query.list();
	    		if(users.get(0).getEmail().equals(user.getEmail())) {
	    			System.out.println("successfull");
	    		}
	    		else {
	    			return false;
	    		}
	    		
	    		tx.commit();
	    		// open your db ok sir
	    		return true;
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return false;
	}

	@Override
	public int signUp(User user) {
		
		    Session session = this.sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();  
	        if(session.save(user)!=null)
	        	{
	        		 transaction.commit();
	        		 session.close();
	        		return 1;
	        	}
	        	else {
	        		 return 0;  
	        	}
	       
	}
	
}
