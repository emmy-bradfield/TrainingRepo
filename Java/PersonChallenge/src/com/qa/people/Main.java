package com.qa.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Person{

	public static void main(String[] args) {
		Person personOne = new Person
		List<Person> arrayOfPeople = new ArrayList<>();
		arrayOfPeople.add(new Person("Emily", 23, "Trainee Software Analysit"));
		arrayOfPeople.add(new Person("James", 21, "Full-time Student"));
		arrayOfPeople.add(new Person("Hillary", 25, "Customs Imports Specialist"));
		arrayOfPeople.add(new Person("Chloe", 24, "Cabin Crew Member"));
		
		
		System.out.println("Enter person's name:");
		String nameSearch = scan.nextLine();
		for (int i = 0; i < arrayOfPeople.size();i++) {
			if (arrayOfPeople.get(i).name.equalsIgnoreCase(nameSearch)) {
				System.out.println("[" + nameSearch.toUpperCase() + " FOUND IN DATABASE]");
				break;
			} else {
				System.out.println("[" + nameSearch.toUpperCase() + " NOT FOUND IN DATABASE]\n\n");
			}
		}
		
	
		for (Person person : arrayOfPeople) {
			System.out.println(" ===== " + person.getName().toUpperCase() + " ===== \n" + person.getName() + " is " + person.getAge() + " years old,"
					+ "\nand works as a " + person.getJobTitle() + "\n");
		}
		
	}

	@Override
	public String toString() {
		String details = (getName() + " is " + getAge() + " years old and works as a " + getJobTitle());
		return details;
	}

}
