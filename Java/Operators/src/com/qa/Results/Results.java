package com.qa.Results;

public class Results {
	
	public static int chemistry, physics, biology, total;
	public static double percentage;

	public static void main(String[] args) {
		marks(50,143,98);
	}
	
	public static void marks(int chem, int phys, int maths) {
		System.out.println("You got " + chem + " marks for Chemistry");
		System.out.println("You got " + phys + " marks for Physics");
		System.out.println("You got " + maths + " marks for Maths");
		
		total = chem + phys + maths;
		
		System.out.println("You got " + total + "/450");
		
		percentage = (double)Math.round(total*100)/450;
		
		System.out.println("Your total percentage for all subjects is " + percentage + "%");
	}
}
