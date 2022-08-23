package com.qa.animal;

public class Bird extends Animal {
	
	public Bird() {
		
	}
	
	public Bird(String habbitat, String type, int quantity, String name) {
		
	}
	
	String noise = "cheep cheep!";
	String fly = "flap flap!";
	
	public void noise() {
		System.out.print("A bird goes " + noise + ", ");
	}
	
	public void fly() {
		System.out.println("and their wings go " + fly);
	}

}
