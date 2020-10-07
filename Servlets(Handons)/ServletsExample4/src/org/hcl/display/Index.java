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
    	  String eventName=request.getParameter("eventname");
    	  String hallName=request.getParameter("hallname");
    	  String type=request.getParameter("type1");
    	  String details=request.getParameter("details");
    	  String owner=request.getParameter("owner");
    	  String sd=request.getParameter("startDate");
    	  String ed=request.getParameter("endDate");
    	  int count=0;
    	  String msg="";
    	
    	  if(eventName =="")
    	  {
    		  msg=msg+"Event Name must not be Empty<br>";
    		  count=count+1;
    	  }
    	  if(hallName == "")
    	  {
    		  msg=msg+"Hall Name must not be Empty<br>";
    		  count=count+1;
    	  }
    	  boolean isNull=false;
    	  try
    	  {
    		  type.contentEquals(null)  ;
    	  }
    	  catch (Exception e) {
		    isNull=true;
		}
    	  if(isNull)
    	  {
    		  msg=msg+"Event Type must not be Empty<br>";
    		  count=count+1;
    	  }
    	 
    	  if(details == "")
    	  {
    		  msg=msg+"Event Details must not be Empty<br>";
    		  count=count+1;
    	  }
    	  if(owner == "")
    	  {
    		  msg=msg+"Event Owner Name must not be Empty<br>";
    		  count=count+1;
    	  }
    	  if(sd == "")
    	  {
    		  msg=msg+"Start Date must not be Empty<br>";
    		  count=count+1;
    	  }
    	  if(ed == "")
    	  {
    		  msg=msg+"End Date must not be Empty<br>";
    		  count=count+1;
    	  }
    	  if(count>1)
    	  {
    		  pw.println("<div style=\"  color:#D33E1E ;\">"+msg+"</div>");
    		  RequestDispatcher rd=request.getRequestDispatcher("/index.html");
    		  rd.include(request, response);
    	  }
    	  else
    	  {
    		  RequestDispatcher rd=request.getRequestDispatcher("/validated");
    		  rd.forward(request, response);
    	  }
    	  
    	  
	}

}
