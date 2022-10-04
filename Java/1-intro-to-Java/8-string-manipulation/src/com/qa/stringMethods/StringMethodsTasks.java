package com.qa.stringMethods;

public class StringMethodsTasks {
	
	public static void taskOne() {
		System.out.println("=======TASK ONE=======\nCreate two Strings where one string has a value of 'yesterday it was raining' and the other string with a value of 'today it is sunny'\r\n"
				+ "- Concatenate both values, capitalise both strings and print out the result.\r\n"
				+ "- The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING\n");
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		String str3 = str2 + ", " + str1;
		System.out.println("=======TASK OUTPUT=======");
		System.out.println(str3.toUpperCase());
		System.out.println("");
		System.out.println("");
	}
	
	public static void taskTwo() {
		System.out.println("=======TASK TWO=======\nCFor this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed"
				+ "\nto use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this"
				+ "\ndefeats the purpose of the exercise:\n");
		
		String str4 = "Look at how fun it is to manipulate text!";
		System.out.println("The string I have made is: " + str4);
		
		System.out.println("");
		System.out.println("====PART A====\nWhen given a String, count and return how many words there are in that String.");
		System.out.println("");
		System.out.println("====TASK OUTPUT====");
		int strLen = str4.length();
		System.out.println("My string has a length of " + strLen + " characters!");
		
		System.out.println("");
		System.out.println("====PART B====\nWhen given a String, print out this String in a vertical fashion, each word on a different line.");
		System.out.println("");
		System.out.println("====TASK OUTPUT====");
		System.out.println(str4.substring(0, 4));
		System.out.println(str4.substring(5, 7));
		System.out.println(str4.substring(8, 11));
		System.out.println(str4.substring(12, 15));
		System.out.println(str4.substring(16, 18));
		System.out.println(str4.substring(19, 21));
		System.out.println(str4.substring(22, 24));
		System.out.println(str4.substring(25, 35));
		System.out.println(str4.substring(36, 41));
		
		System.out.println("");
		System.out.println("====PART C====\nWhen given a String, print out this String in a vertical fashion in reverse order, each word on a different line.");
		System.out.println("");
		System.out.println("====TASK OUTPUT====");
		System.out.println(str4.substring(36, 41));
		System.out.println(str4.substring(25, 35));
		System.out.println(str4.substring(22, 24));
		System.out.println(str4.substring(19, 21));
		System.out.println(str4.substring(16, 18));
		System.out.println(str4.substring(12, 15));
		System.out.println(str4.substring(8, 11));
		System.out.println(str4.substring(5, 7));
		System.out.println(str4.substring(0, 4));
		
		System.out.println("");
		System.out.println("====PART D====\nA find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message."
				+ "\nA boolean value should be returned to indicate whether or not the second String has been found in the message.");
		System.out.println("");
		System.out.println("====TASK OUTPUT====");
		String message1 = "hello";
		System.out.println("Is '" + message1 + "' in '" + str4 +"'?");
		System.out.println(str4.equalsIgnoreCase("message"));
	}

	public static void main(String[] args) {
		taskOne();
		taskTwo();
	}

}
