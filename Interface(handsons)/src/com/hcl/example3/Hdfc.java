package com.hcl.example3;

public class Hdfc implements MutualFund {
	int duration;
	int amount;
	int interest=49;
	public Hdfc(int duration, int amount) {
		super();
		this.duration = duration;
		this.amount = amount;
	}
	public void duration()
	{
	System.out.println("In "+duration+" you will return :");
	}
	public void amount()
	{
		System.out.println("the amount is : "+((amount*56)/100)*duration);
	}
}
