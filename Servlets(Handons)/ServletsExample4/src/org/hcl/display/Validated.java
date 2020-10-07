package org.hcl.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validated")
public class Validated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String eventName=request.getParameter("eventname");
  	  String hallName=request.getParameter("hallname");
  	  String type=request.getParameter("type1");
  	  String details=request.getParameter("details");
  	  String owner=request.getParameter("owner");
  	  String sd=request.getParameter("startDate");
  	  String ed=request.getParameter("endDate");
  	  pw.println("<h1 style=	\"  color:#006400;\">Event Created Successfully</h1>");
  	  	pw.println("<h3>Event Details</h3>");
		pw.println("<table border=1 id='exhibition'");
		pw.println(" <tr><td>Event Name</td><td>"+eventName+"</td> </tr>");
		pw.println(" <tr><td>Hall Name</td><td>"+hallName+"</td> </tr>");
		pw.println(" <tr><td>Event Type</td><td>"+type+"</td> </tr>");
		pw.println(" <tr><td>Details</td><td>"+details+"</td> </tr>");
		pw.println(" <tr><td>Owner</td><td>"+owner+"</td> </tr>");
		pw.println(" <tr><td>Start Date</td><td>"+sd+"</td> </tr>");
		pw.println(" <tr><td>End Date</td><td>"+ed+"</td> </tr>");
		pw.close();
	}

}
