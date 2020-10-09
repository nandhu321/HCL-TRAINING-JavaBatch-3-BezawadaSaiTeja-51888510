package org.hcl.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<h1>Event Management System</h1>");
        HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("ename");
        
        pw.print("Event "+n+"  is Planned to Held on 2018-09-05 in Rudolfinum");  
  
        pw.close();  
  
	}

}
