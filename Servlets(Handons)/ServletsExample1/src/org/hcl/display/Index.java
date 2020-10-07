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
       
   
    public Index() {
        super();
   
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	PrintWriter pw=response.getWriter();
	pw.println("<h1 style=	\"  color:#FF1493;\">Welcome to Hall Paradise</h1>");
	pw.println("<p>the type of events are</p>");
	pw.println("<ul><li>Exhibition</li>");
	pw.println("<li>Stage Show</li></ul>");
	pw.close();
	}

}
