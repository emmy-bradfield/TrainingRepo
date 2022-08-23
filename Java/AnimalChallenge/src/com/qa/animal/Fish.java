package com.qa.animal;

public class Fish extends Animal {
	
	String colour;
	String bowl;
	
	public Fish() {
		
	}
	
	public Fish(String colour, String bowl, String habbitat, String type, int quantity, String name) {
		
	}
	
	public void out(String name, String bowl) {
		this.getName();
		this.getBowl();
		System.out.println("Your fish, " + name + " lives in a " + bowl + "-shaped fish bowl!");
	}
	
	public String getName() {
		return name;
	}

	public String getBowl() {
		return bowl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String bowl) {
		this.bowl = bowl;
	}

}
