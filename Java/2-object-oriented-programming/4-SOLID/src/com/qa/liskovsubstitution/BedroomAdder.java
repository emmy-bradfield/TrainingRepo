package com.qa.liskovsubstitution;

public class BedroomAdder {
	public void addRoom(ManyRoom property) {
		property.setSize(property.getSize() + 40);
		property.setBedrooms(property.getBedrooms() + 1);
		System.out.println("The property on " + property.getRoad() + " now has " + property.getBedrooms() + " bedrooms and is " + property.getSize() + " square feet.");
	}
	
	public void makeBigger(OneRoom property) {
		property.setSize(property.getSize() + 40);
		System.out.println("The property on " + property.getRoad() + " still has " + property.getBedrooms() + " bedrooms but is " + property.getSize() + " square feet.");
	}
}
