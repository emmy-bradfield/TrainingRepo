package com.qa.liskovsubstitution;

public class Studio extends OneRoom {
    private String road;
	private int sqft;


	public Studio(String road, int sqft) {
		bedrooms = 0;
    	this.road = road;
    	this.sqft = sqft;;
	}

	@Override
	public String getRoad() {
		return road;
	}

	@Override
	public void setRoad(String road) {
		this.road = road;
	}


	@Override
	public Integer getBedrooms() {
		return bedrooms;
	}


	@Override
	public Integer getSize() {
		return sqft;
	}

	@Override
	public void setSize(Integer sqft) {
		this.sqft = sqft;
		
	}
}
