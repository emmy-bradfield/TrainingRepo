package com.qa.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Lion extends LandMammals implements Animals, DisneyMovies{
	
	public void lionMethod() {
		System.out.println("- Lions are a land mammal.\n- They are also a type of animal.\n- Lions star in a Disney Movie");
		releaseDate();
		noise();
		habitat();
		offspring();
	}
	
	public String species = "Lion";

	@Override
	public void releaseDate() {
		System.out.println("- The Lion King was released in 1994");
		
	}

	@Override
	public void noise() {
		System.out.println("- Lions go > ROAR <");
		
	}

	@Override
	public void habitat() {
		List<String> habitats = new ArrayList<>();
		habitats.add("Woodlands");
		habitats.add("Deserts");
		habitats.add("Plains");
		habitats.add("Savanahs");
		System.out.println("- Lion's live in:\n-> " + habitats.get(0) + "\n-> " + habitats.get(1) + "\n-> " + habitats.get(2) + ", and\n-> " + habitats.get(3));
		
	}

	@Override
	public void offspring() {
		System.out.println("- Like other land mammals, " + species + "s carry their children in their tummy!");
		
	}

}
