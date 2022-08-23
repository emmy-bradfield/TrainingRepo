package com.qa.liskovsubstitution;

public class Penthouse extends ManyRoom {
	
    private String road;
	private Integer sqft;
	private Integer bedrooms;

	public Penthouse(String road, int sqft, int bedrooms) {
        this.bedrooms = bedrooms;
        this.sqft = sqft;
        this.road = road;
    }

	@Override
	public String getRoad() {
		return road;
	}

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


	@Override
	public void setBedrooms(Integer bedrooms) {
		this.bedrooms=bedrooms;
		
	}

}
