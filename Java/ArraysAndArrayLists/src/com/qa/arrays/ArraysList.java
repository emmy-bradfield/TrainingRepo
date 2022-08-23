package com.qa.arrays;
import java.util.ArrayList; // must be imported whenever you use ArrayLists
import java.util.List; // must be imported whenever you use Lists
import java.util.*; // useful as Java Util holds most needed features 

// Arrays are immutable - you cannot change their length once they are created
// ArrayLists, however, are mutable - you can change their length

public class ArraysList {

	public static void main(String[] args) {
		// Create a list, and then use [name].add([value]) to populate it
		List<String> names = new ArrayList<>(); 
		names.add("Emily");
		names.add("James");
		names.add("Helen");
		names.add("Poopy");
		names.add("Mr Poop");
		
		// Create a list and populate it straight away
		List<Integer> ages = List.of(23, 21, 60, 13); // Integer must be written in full, not as "int"
		
		// Getting values from a list using .get([index])
		System.out.println(names.get(3));
		
		// Setting a list value using .set([index])
		names.set(3, "Poppy");
		
		System.out.println(names.get(3));
		
		// Removing a name using .remove([index])
		names.remove(4);
		
		// Getting the size of a list
		System.out.println(names.size());
		
		// Clearing a list can be done with .clear(), but I won't be as I want the list populated for the next steps
		
		// Looping through an ArrayList
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Person " + (i+1) + " is " + names.get(i));
			// i+1 is used as index starts at zero, but I want the output to start at 1
		}
		
		// sorting a list a-z or ascending numerically
		System.out.println("In alphabetical order:");
		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Person " + (i+1) + " is " + names.get(i));
		}
	}

}
