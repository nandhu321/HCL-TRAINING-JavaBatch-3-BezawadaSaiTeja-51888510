package org.hcl.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String ename=request.getParameter("eventname");
		pw.println("<h1>Event Management System</h1>");
		pw.println("Welcome to this Event "+ename);
		HttpSession session=request.getSession();  
        session.setAttribute("ename",ename); 
		pw.println("<form action='./display' method='post'>");
		pw.println("<input  style='margin-left: 120px; margin-top:10px;'type='submit' value='Get Detail'></form>");
	 
        pw.close();
		
		
		
	}

}
