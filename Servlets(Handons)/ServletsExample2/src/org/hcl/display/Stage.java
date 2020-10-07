package org.hcl.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Stage
 */
@WebServlet("/stage")
public class Stage extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Stage() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<h1 style=	\"  color:#006400;\">New Year Eve</h1>");
		pw.println("<table border=1 id='StageShow'");
		pw.println(" <tr><th>Name</th> <th>New Year Eve</th> </tr>");
		pw.println(" <tr><td>Hall Name</td><td>PVR Lulu Mall</td> </tr>");
		pw.println(" <tr><td>Date</td><td>10-10-2020</td> </tr>");
		pw.println(" <tr><td>Start Time</td><td>10:00:00</td> </tr>");
		pw.println(" <tr><td>End Time</td><td>12:00:00</td> </tr>");
		
		pw.close();
	}

}
