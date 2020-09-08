package com.hcl.example6;

public class StageEvent extends Event {
	private int noOfShows;
	private int noOfSeatsPerShow;

	public StageEvent() {

	}

	public StageEvent(int noOfShows, int noOfSeatsPerShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public Double projectedRevenue() {

		return (double) 50 * noOfSeatsPerShow * noOfShows;
	}

}
