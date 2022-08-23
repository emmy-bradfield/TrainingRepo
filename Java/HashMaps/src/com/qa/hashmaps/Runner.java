package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {
	
	public void practiceCode() {
		Map<String, Integer> people = new HashMap<>();

		people.put("Emily", 23);
		people.put("James", 20);
		people.put("Ammar", 21);
		people.put("Bianca", 20);

		// Using .entrySet() to iterate all keys and values, joined with '='
		for (Entry<String, Integer> i : people.entrySet()) {
			System.out.println(i);
		}
		System.out.println("");

		// Using .keySet to iterate all keys and print them with their value using
		// .get(key)
		for (String key : people.keySet()) {
			System.out.println(key + " is " + people.get(key) + " years old");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		practiceCode();
	    }
	}

