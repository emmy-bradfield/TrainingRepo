package com.qa.enhancedForLoops;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Emily");
		names.add("James");
		names.add("Helen");
		names.add("Poppy");
		
		for(String s : names) { // Similar to a normal for loop, but the colon informs the loop to do all values in names
			System.out.print(s + "\n"); // '\n' simply represents a newline - println can be used, I just wanted to show this
		}

	}

}
