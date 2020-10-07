package org.hcl.display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Exhibition
 */
@WebServlet("/exhibition")
public class Exhibition extends GenericServlet {
	private static final long serialVersionUID = 1L;
   
    public Exhibition() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<h1 style=	\"  color:#006400;\">TestFair 2018 expo</h1>");
		pw.println("<table border=1 id='exhibition'");
		pw.println(" <tr><th>Name</th> <th>TestFair 2017 expo</th> </tr>");
		pw.println(" <tr><td>Hall Name</td><td>PVR Superplex</td> </tr>");
		pw.println(" <tr><td>Start Date</td><td>10-10-2020</td> </tr>");
		pw.println(" <tr><td>End Date</td><td>10-10-2030</td> </tr>");
		
		
		pw.close();
	}

}
