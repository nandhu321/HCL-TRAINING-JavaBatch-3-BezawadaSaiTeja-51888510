package com.hcl.example7;

public class Film {
	int d ;
	String name ;
	public Film()
	{
		
	}
	public Film(int d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int getFilId(String filmName,Film f[]) 
	{
		int rowNo=0;
		for(int i=0;i<f.length;i++ )
		{
			if(f[i].getName().equals(filmName))
			{
				rowNo=f[i].getD();
			}
		}
		return rowNo;
	}

}
