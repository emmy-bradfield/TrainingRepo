package com.qa.liskovsubstitution;

public abstract class ManyRoom extends Apartment{
	
	public Integer bedrooms;
	public Integer sqft;
	
	public abstract Integer getBedrooms();
	
	public abstract void setBedrooms(Integer bedrooms);
	
	public abstract Integer getSize();
	
	public abstract void setSize(Integer sqft);

	protected abstract void setRoad(String road);

	protected abstract String getRoad();

}
