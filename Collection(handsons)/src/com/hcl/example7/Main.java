package com.hcl.example7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;




public class Main {
	

	public static void main(String[] args) throws IOException {
	
		    String file ="abc.txt";
		   ArrayList<CallLog> c=new ArrayList<>();
		    
		    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
		        String line="";
		        
		        while ((line = br.readLine()) != null) {
		        	String[] l1=line.split(",");
		        	CallLog c1=new CallLog(l1[0],l1[1],l1[2]);
		        	c.add(c1);
		        		}
		           
		        }
		     catch (FileNotFoundException e) {
		    	 e.printStackTrace();
		      }
		    Collections.sort(c,(obj1,obj2)->{
		    	CallLog e1=(CallLog)obj1;
				CallLog e2=(CallLog)obj2;
				String p=e1.getName();
				String q=e2.getName();
				return q.compareTo(p);
		    });
		    CallLog.display(c);
		    
		    
}
}