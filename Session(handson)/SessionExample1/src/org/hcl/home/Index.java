package org.hcl.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String ename=request.getParameter("eventname");
		if(ename=="")
		{
			pw.println("Please enter the Event name");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		}
		pw.close();
	
		
	}

}
