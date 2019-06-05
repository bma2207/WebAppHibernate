package com.axelor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.domains.ContactDetails;
import com.axelor.service.ContactServiceImpl;

/**
 * Servlet implementation class ContactBook
 */

@WebServlet("/contactbook") 
public class ContactBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ContactServiceImpl contactService=new ContactServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doPost(request, response);
		 
	     
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
	     PrintWriter out=response.getWriter();
	     
		
		  String fullname=request.getParameter("fullname"); 
		  String mobileno=request.getParameter("mobileno");
		    
          String id=request.getParameter("id");
	     
	     if(id == null) {
	    	 
	    	  ContactDetails contactDetails=new ContactDetails();
			  contactDetails.setFullName(fullname); 
			  contactDetails.setMobileNo(mobileno);
			  
			  contactService.addContact(contactDetails);
			  
			  response.sendRedirect("contactlist.jsp");
			  
	   	 
	     }else {
	    
	            request.getRequestDispatcher("index.jsp").forward(request, response);  

	    	 	
	    	  
	     }
	    	 
	    
		
		  
		  
		 	     
	     

	}

}
