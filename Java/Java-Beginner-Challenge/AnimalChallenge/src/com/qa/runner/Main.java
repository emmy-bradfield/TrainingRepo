package com.qa.runner;
import com.qa.animal.*;

// Stats: int size, String look, String habitat, String name, String breed, int age, int life

public class Main {

	public static void main(String[] args) {
		// Cats
		Animal catOne = new Cat(2, "long-haired", "land", "Margarette Cat-cher", "tabby", 3, 18);
		Cat catTwo = new Cat(2, "short-haired", "land", "Poppy", "tortoiseshell", 9, 18);
		
		// Dogs
		Dog dogOne = new Dog(3, "raggy", "land", "Jacob Reese-Dogg", "husky", 2, 13);
		Animal dogTwo = new Dog(3, "compact", "land", "smushums", "pug", 1, 13);
		
		// Fish
		Fish fishOne = new Fish(0, "shiny", "water", "Bob", "goldfish", 1, 5);
		Animal fishTwo = new Fish(0, "scaly", "water", "Mr Johnson", "koi", 2, 5);
		
		// Birds
		Bird birdOne = new Bird(1, "elongated", "air", "Jerome", "cockatoo", 3, 15);
		Animal birdTwo = new Bird(1, "dishevled", "air", "Polly", "parrot", 12, 15);
		
		// Outputs
		((Animal) catOne).print();
		catTwo.print();
		
		dogOne.print();
		((Animal) dogTwo).print();
		
		fishOne.print();
		((Animal) fishTwo).print();
		
		birdOne.print();
		((Animal) birdTwo).print();
	}

}
