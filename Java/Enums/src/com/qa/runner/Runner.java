package com.qa.runner;

import com.qa.enums.*;

public class Runner {
	
	public static void enumsRunner() {
		// Here, the variable earthWeight is initialised by parsing 175 as a double and 
		// setting it as such, then the mass is caluclated for EARTH using such
		double earthWeight = Double.parseDouble("175");
		double mass = earthWeight/Planet.Earth.surfaceGravity();
		System.out.printf("If your weight on earth is %.2f then your mass is %.2f%n%n", earthWeight, mass);
		
		// This section then iterates through the enum values with the mass calculated prior as 17.85
		// and calculates a person's weight on each planet, printing the planet and weight out 
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %.2f%n", p, p.surfaceWeight(mass));
		}
	}

	public static void main(String[] args) {
		enumsRunner();


	}

}
