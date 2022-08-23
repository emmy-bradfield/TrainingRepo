package com.qa.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysListsTask {
	
	public static void arrayTask() {
		System.out.println("1) Create a new ArrayList");
		System.out.println("");
		List<String> colours = new ArrayList<>();
		System.out.println("Array List 'colours' created");
		System.out.println("");
		System.out.println("");
		System.out.println("2) Add() several elements");
		System.out.println("");
		colours.add("Blue");
		colours.add("Red");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Purple");
		System.out.println("all elements added");
		System.out.println("");
		System.out.println("");
		System.out.println("3) Print out the entire ArrayList");
		System.out.println("");
		System.out.println("Colours contains: " + colours.get(0) + ", " + colours.get(1) + ", " + colours.get(2) + ", " +
		colours.get(3) + " and " + colours.get(4));
		System.out.println("");
		System.out.println("");
		System.out.println("4) Iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)");
		System.out.println("");
		for (int i = 0; i < colours.size(); i ++) {
			System.out.println("Added " + colours.get(i) + " to 'colours'");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("5) Get() specific elements");
		System.out.println("");
		System.out.println("Element 0 is -> " + colours.get(0));
		System.out.println("");
		System.out.println("Element 2 is -> " + colours.get(2));
		System.out.println("");
		System.out.println("");
		System.out.println("6) Set() different elements");
		System.out.println("");
		System.out.println("Set element 1 (red) as 'pillarbox red'");
		System.out.print(colours.get(1) + " -> ");
		colours.set(1, "Pillarbox Red");
		System.out.println(colours.get(1));
		System.out.println("");
		System.out.println("Set element 3 (yellow) as 'canary yellow'");
		System.out.print(colours.get(3) + " -> ");
		colours.set(3, "Canary Yellow");
		System.out.println(colours.get(3));
		System.out.println("");
		System.out.println("");
		System.out.println("7) Remove() elements");
		System.out.println("");
		System.out.println("remove element 4 (purple)");
		System.out.print(colours.get(4) + " -> ");
		colours.remove(4);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("8) Sort() the ArrayList (try this with several object types)");
		System.out.println("");
		Collections.sort(colours);
		for (int j = 0; j < colours.size(); j ++) {
			System.out.println("Colour " + (j+1) + " is " + colours.get(j));
		}
		System.out.println("");
		System.out.println("creating new list to sort...");
		System.out.println("");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(23);
		numbers.add(84);
		numbers.add(5);
		numbers.add(908);
		numbers.add(218);
		System.out.println("created ArrayList 'numbers' and populated list with: ");
		for (int k = 0; k < numbers.size(); k++) {
			System.out.print(numbers.get(k) + " ");
		}
		System.out.println("");
		System.out.println("sorting list 'numbers' in ascending numerical order...");
		System.out.println("");
		Collections.sort(numbers);
		for (int l = 0; l < numbers.size(); l ++) {
			System.out.print("Index position " + l + " : value " + numbers.get(l));
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		arrayTask();
	}
	
}
