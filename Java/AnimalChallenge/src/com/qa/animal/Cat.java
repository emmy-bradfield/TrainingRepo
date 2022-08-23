package com.qa.animal;

public class Cat extends Animal {

	String breed;
	Integer age;
	
	public Cat() {
		
	}
	
	public Cat(String name, int age, String breed) {
		
	}

	public void catYears(int age) {
		int catAge = (age * 5);
		System.out.println("Your cat is " + catAge + " in cat years!");
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
