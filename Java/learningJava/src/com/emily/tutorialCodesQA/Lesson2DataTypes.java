package com.emily.tutorialCodesQA;

public class Lesson2DataTypes {

	public static void main(String[] args) { //main() function which informs system of what to do with the code below
		printOut();
	}

	public static void printOut() { //printOut() method informs system to print all following methods to console
		System.out.println(intReturn());
		System.out.println(booReturn());
		System.out.println(chaReturn());
		System.out.println(lonReturn());
		System.out.println(floReturn());
		System.out.println(strReturn());
	}

	public static int intReturn() { //intReturn() method informs system to return (store) an integer with value 0
		return 0;
	}

	public static boolean booReturn() { //booReturn() method informs system to return (store) a boolean with value true
		return true;
	}

	public static char chaReturn() { //chaReturn() method informs system to return (store) a character with value 'p'
		return 'p';
	}

	public static long lonReturn() { //lonReturn() method informs system to return (store) a long integer with value 52
		return 52L;
	}

	public static float floReturn() { //floReturn() method informs system to return (store) a float/decimal with value 0.6
		return 0.6F;
	}

	public static String strReturn() { //intReturn() method informs system to return (store) a string with value 'Hi, there'
		return "Hi, there";
	}

	public static void voiReturn() { //voiReturn() method informs system to return (store) nothing
		// no return
	}

}
