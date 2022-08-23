package com.qa.animal;

public class Dog extends Animal {
	String breed;
	Integer age;
	
	public Dog() {
		
	}
	
	public Dog(String breed, int age, String habbitat, String type, int quantity, String name) {
		
	}

	public void dogYears(int age) {
		int dogAge = (age * 7);
		System.out.println("Your dog is " + dogAge + " in dog years!");
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
