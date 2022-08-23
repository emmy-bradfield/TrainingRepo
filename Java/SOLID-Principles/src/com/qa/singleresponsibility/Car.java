package com.qa.singleresponsibility;

public class Car {
	// attributes
    private String colour;
    private String model;
    private int mileage;
    private boolean spoiler;

    // constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
    }
    
    // getters and setters
    
    public String getColour() {
    	return colour;
    }
    
    public void setColour(String colour) {
    	this.colour = colour;
    }
    
    public String getModel() {
    	return model;
    }
    
    public void setModel(String model) {
    	this.model = model;
    }
    
    public Integer getMileage() {
    	return mileage;
    }
    
    public void setMileage(Integer mileage) {
    	this.mileage = mileage;
    }

    public Boolean getSpoiler() {
    	return spoiler;
    }
    
    public void setSpoiler(Boolean spoiler) {
    	this.spoiler = spoiler;
    }
    
    public String isSpoiler() {
    	String spoiler;
    	if (getSpoiler() == true) {
    		spoiler = "a spoiler";
    	} else {
    		spoiler = "no spoiler";
    	}
    	return spoiler;
    }
    
    public String carDetails() {
    	String carInfo = (getColour() + " " + getModel() + " with " + getMileage() + " miles on the clock and " + isSpoiler());
    	return carInfo;
    }

}