package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Lead;
import utility.HibernateConnectionManager;

public class LeadDAO implements LeadDaoInterface {
	private SessionFactory sessionFactory = HibernateConnectionManager.getSessionFactory();
	@Override
	public void insertLead(Lead lead) throws SQLException {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(lead);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Lead selectLead(int blogid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lead> selectAllLeads() {
		// TODO Auto-generated method stub
		 Session session = this.sessionFactory.openSession();
		 CriteriaBuilder builder = session.getCriteriaBuilder();
		 CriteriaQuery<Lead> query = builder.createQuery(Lead.class);
		  Root<Lead> root = query.from(Lead.class);
		  query.select(root);
		  Query<Lead> q=session.createQuery(query);
		 List<Lead> listLead = q.getResultList();
		return listLead;
	}

	@Override
	public void deleteLead(int id) throws SQLException {
		// TODO Auto-generated method stub
		 Session session = this.sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        Lead lead = session.get(Lead.class, id);
	        session.delete(lead);
	        transaction.commit();
	        session.close();
		
	}

	@Override
	public void updateLead(Lead lead) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

}
