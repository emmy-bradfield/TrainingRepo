package com.qa.people;

import java.util.ArrayList;
import java.util.List;

public class People{
	List<Person> arrayOfPeople = new ArrayList<>();

	@Override
	public void makeString() {
		String details = getName() + " is " + getAge() + " years old and works as a " + getJobTitle();
		System.out.println("=== " + getName() + " ===\n" + details + "\n");	
	}

	@Override
	public void addToArray() {
		arrayOfPeople.add(new Person("Emily", 23, "Trainee Software Analysit"));
		arrayOfPeople.add(new Person("James", 21, "Full-time Student"));
		arrayOfPeople.add(new Person("Hillary", 25, "Customs Imports Specialist"));
		arrayOfPeople.add(new Person("Chloe", 24, "Cabin Crew Member"));
		
	}
	
		
}
