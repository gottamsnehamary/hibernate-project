package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import antlr.collections.List;
import dao.LeadDAO;
import model.Lead;

/**
 * Servlet implementation class ViewAllLeadController
 */
@WebServlet(urlPatterns= {"/AllLead"})
public class ViewAllLeadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ViewAllLeadController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("View All Leads");
		System.out.println("Getting all lead post");
		LeadDAO leaddao = new LeadDAO();
		java.util.List<Lead> listLead = leaddao.selectAllLeads();
		for(Lead leadlist:listLead) {
			System.out.println(leadlist.getId());
			System.out.println(leadlist.getName());
			System.out.println(leadlist.getGender());
			System.out.println(leadlist.getAddress());
			System.out.println(leadlist.getPhoneno());
			System.out.println(leadlist.getEmail());
			System.out.println(leadlist.getUsername());
			System.out.println(leadlist.getPassword());
			
		}
		request.setAttribute("listLead", listLead);
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/leadView.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
