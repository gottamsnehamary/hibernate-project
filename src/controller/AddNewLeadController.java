package controller;

import java.io.IOException;

import javax.persistence.Column;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LeadDAO;
import model.Lead;

/**
 * Servlet implementation class ProductController
 */
@WebServlet( urlPatterns= {"/new"})
public class AddNewLeadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Getting into Add LEAD");
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/leadListView.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering DO POST METHOD LEAD");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		long phoneno = Long.parseLong(request.getParameter("phoneno"));
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(phoneno);
		System.out.println(email);
		System.out.println(username);
		System.out.println(password);

		Lead lead = new Lead();
		lead.setId(id);
		lead.setName(name);
		lead.setGender(gender);
		lead.setAddress(address);
		lead.setPhoneno(phoneno);
		lead.setEmail(email);
		lead.setUsername(username);
		lead.setPassword(password);
	
		LeadDAO leaddao = new LeadDAO();
		try {
			leaddao.insertLead(lead);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("AllLead");
	}

}
