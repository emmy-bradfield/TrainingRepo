package com.qa.polymorphism;

public class OldRunner {

	/*public static void main(String[] args) {
		System.out.println("=====COW====");
		Cow cow = new Cow(); // Cow accesses from cow (itself) animal (inheritance) and object (as it is an object) 
		cow.speak(); 		 // As a result, we can run all methods
		cow.sleep();
		System.out.println(" ");
		System.out.println("===ANIMAL===");
		Animal animal = new Cow(); // Animal accesses from animal (itself) and object (as it is an object)
		((Cow) animal).speak();	   // As a result, we must use ((Cow) animal) instead of cow to allow it to access the cow
		animal.sleep();			   // class and use those methods
		System.out.println(" ");
		System.out.println("===OBJECT===");
		Object object = new Cow(); // Object only accesses object (itself). As a result, ((Cow) object) is used to tell
		((Cow) object).speak();	   // the script to cast from 'cow' and access those methods
		((Cow) object).sleep();
	} */
	
	// In essence, we use casting an polymorphism to create a new child type from its parent (e.g., Animal animal = new Cow();)
	// and then simply specify in any methods that that is what we have done (e.g., ((Cow) animal).speak();) and allow it to
	// cast from that object and access its attributes/methods.
}
