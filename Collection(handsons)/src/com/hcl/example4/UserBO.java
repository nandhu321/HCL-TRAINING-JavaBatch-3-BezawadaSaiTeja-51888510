package com.hcl.example4;

import java.util.ArrayList;

public class UserBO  {
	

	void removeUser(int n1,int n2,ArrayList<User> a)
	{
		for(int i=n1;i<n2;i++)
		{
			a.remove(i);
			
		}
		User.display(a);
	}
	
	

}
