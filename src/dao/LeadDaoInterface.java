package dao;

import java.sql.SQLException;
import java.util.List;

import model.Lead;

public interface LeadDaoInterface {

	void insertLead(Lead lead) throws SQLException;
	Lead selectLead(int blogid);
	List<Lead> selectAllLeads();
	void deleteLead(int id) throws SQLException;
	void updateLead(Lead lead) throws SQLException, Exception;
}
