package com.hcl.example1;

public class Exception1 {
	
	public void divide(int arr[])
	{	int i=0;
		int j=10;
		try {
		while(i>=0)
		{
			System.out.println(arr[i]/j);
			i=i+1;
			j=j-1;
		}
	}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Elements Over");
		}
		
	}

}
