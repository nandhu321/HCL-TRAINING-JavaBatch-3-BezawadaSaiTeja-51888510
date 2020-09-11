package com.hcl.example7;

public class Songs {
	int d ;
	String name ;
	String singers; 
	int film_id ;
	public Songs()
	{
		
	}
	public Songs(int d, String name, String singers, int film_id) {
		super();
		this.d = d;
		this.name = name;
		this.singers = singers;
		this.film_id = film_id;
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
	public String getSingers() {
		return singers;
	}
	public void setSingers(String singers) {
		this.singers = singers;
	}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	


}
