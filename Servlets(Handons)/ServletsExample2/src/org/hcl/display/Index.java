package org.hcl.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/index")
public class Index extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
 

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	pw.println("<div><h1 style=	\"  color:#006400;\">Welcome to Popular Paradise</h1>");
	
	pw.println("<a style=\" margin-left : 20%;\"href='./exhibition' >Exhibition</a><br>");

	pw.println("<a style=\" margin-left : 20%;\"href='./stage'>Stage Show</a></div>");
	
	pw.close();
	}

}
