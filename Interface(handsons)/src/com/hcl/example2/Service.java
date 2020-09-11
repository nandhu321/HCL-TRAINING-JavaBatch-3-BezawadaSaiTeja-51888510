package com.hcl.example2;



public class Service implements Car {
	
	int charges=5000;
    int sum=0;
    int c;
    int carNum;
    public Service(int carNum, int year, String brand) {
		super();
		this.carNum = carNum;
		this.year = year;
		this.brand = brand;
	}
	int year;
    String brand;
    
    
    public  void input()
    {
    
    }
	public void sum()
	{
		
		while(carNum>0)
		{
			c=carNum%10;
			sum=sum+c;
			carNum=carNum/10;
		}
		if(sum%2==0)
		{
			
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		}
		else
		{
		System.out.println("you can come on Monday, Wednesday and Friday.");	
		}

		
		
	}
	public void  years()
	{
		
		if(year >5)
		{
			System.out.println("you are eligible for free washing");
		}
		else {
			System.out.println("you are not eligible for free washing");
		}
	}
	public void  brand()
	{	
		
		if(brand.equals("maruti"))
		{
			System.out.println("your service charges :"+(charges-(charges*5)/100));
		}
		else
		{
			System.out.println("your service charges :"+charges);
		}
	}

}
