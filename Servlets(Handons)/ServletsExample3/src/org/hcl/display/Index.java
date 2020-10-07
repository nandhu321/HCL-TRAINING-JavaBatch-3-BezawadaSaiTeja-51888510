package org.hcl.display;

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
    	  String name=request.getParameter("uname");
    	  String number=request.getParameter("num");
    	  String email=request.getParameter("email");
    	  String city=request.getParameter("city");
    	  int count=0;
    	  if(name.equals("") || number.equals("")|| email.equals("")|| city.equals(""))
    	  {
    		  count=count+1;
    	  }
    
    	  if(count>0)
    	  {
    		  pw.println("Please Type all the information required.");
    		  RequestDispatcher rd=request.getRequestDispatcher("/index.html");
    		  rd.include(request, response);
    		  
    	  }
    	  else
    	  {
    		 RequestDispatcher rd=request.getRequestDispatcher("/display") ;
    		 rd.forward(request, response);
    	  }
    	  
      }

}
