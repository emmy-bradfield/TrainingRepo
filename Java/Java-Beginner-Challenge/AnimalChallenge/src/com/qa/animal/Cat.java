package com.qa.animal;

public class Cat extends Animal{
	
	private String name;
	private String breed;
	
	public Cat() {}
	
	public Cat(int size, String look, String habitat, String name, String breed, int age, int life) {
		super(size, look, habitat, age, life);
		this.setName(name);
		this.setBreed(breed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String howOld() {
		int age = getAge();
		return age + " years old, which is " + (age*5) + " in cat years!\n".toString();
	}
	
	@Override
	public String lifeEx() {
		int life = getLife();
		return life + " years ".toString();
	}
	

	@Override
	public String makeString() {
		int size = getSize();
		String s = null;
		if (size == 1) {
			s = "S";
		} else if (size == 2) {
			s = "M";
		} else if (size == 3) {
			s = "L";
		} else if (size == 4) {
			s = "XL";
		} else if (size == 0) {
			s = "XS";
		}
		return "Cat\nName of cat: " + getName() + "\nBreed of cat: " + getBreed() + "\nHabitat of cat: " + getHabitat() + "\nCats are size category " + getSize() + " (" + s + ") and this cat is " + getLook().toString();
	}
	
	public void print() {
		System.out.println(makeString());
		System.out.println("Cat's have a life expectancy of " + lifeEx());
		System.out.print(" and this cat is " + howOld() + "\n");
	}


}