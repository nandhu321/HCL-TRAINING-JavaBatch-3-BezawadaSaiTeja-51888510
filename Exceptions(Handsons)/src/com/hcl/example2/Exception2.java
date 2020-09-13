package com.hcl.example2;

public class Exception2 {
	public void divide(int arr[],int n)
	{	int i;
		try {
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Result : "+arr[i]/n);
		}
	}
		catch (ArithmeticException e)
		{
			System.out.println("Elements Over");
		}
		
	}
}
