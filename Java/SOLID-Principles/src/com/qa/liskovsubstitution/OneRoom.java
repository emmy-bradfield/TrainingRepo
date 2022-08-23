package com.qa.liskovsubstitution;

public abstract class OneRoom extends Apartment{
	public Integer bedrooms;
	public Integer sqft;
	
	public abstract Integer getBedrooms();
	
	public abstract Integer getSize();
	
	public abstract void setSize(Integer sqft);

	public abstract String getRoad();
	
	public abstract void setRoad(String road);


}
