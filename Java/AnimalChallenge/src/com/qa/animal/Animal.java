package com.qa.animal;

public class Animal implements PetFacts, WordFacts{
	
	// Set three variables
	public String name;
	public String breed;
	public Integer age;
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void wordInfo() {
		int len = this.getName().length();
		System.out.print("The name " + this.getName() + " is " + len + " letters long and ");
		if (this.getName().indexOf('e') != -1) {
			System.out.print("contains the letter 'e'");
		} else {
			System.out.print("does NOT contain the letter 'e'");
		}		
	}

	@Override
	public void petInfo() {
		System.out.println("You have a pet called " + this.getName() + ", who is a " + this.getBreed() + " and is " + this.getAge() + " years old!");
		
	}

}
