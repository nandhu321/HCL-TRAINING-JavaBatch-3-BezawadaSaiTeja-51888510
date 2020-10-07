package org.hcl.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
   	  String name=request.getParameter("uname");
   	  String number=request.getParameter("num");
   	  String email=request.getParameter("email");
   	  String city=request.getParameter("city");
   	  pw.println("<h1 style=	\"  color:#006400;\">Details of the User</h1>");
   	  pw.println("<table border=1 id='user'");
   	  pw.println(" <tr><th>Name</th> <th>Phone Number </th> <th>Email </th><th>City </th></tr>");
   	pw.println(" <tr><td>"+name+"</td><td>"+number+"</td> <td>"+email+"</td><td>"+city+"</td></tr>");
	}

}
