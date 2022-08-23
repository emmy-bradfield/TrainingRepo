package com.qa.conditionsals;

public class ResultsRevisited {
public static double rPhy, rChe, rBio, pPhy, pChe, pBio, rtotal, pTotal;

	public static void main(String[] args) {
		grades(102, 131, 74);
		finalGrade();
	}
	
	public static Int grades(int rPhy, int rChe, int rBio) {
		
	}
	
	public static String finalGrade() {
		pPhy = (rPhy/150)*100;
		pChe = (rChe/150)*100;
		pBio = (rBio/150)*100;
		rtotal = rPhy + rChe + rBio;
		pTotal = (rtotal/450)*100;
		if (pPhy > 59 || pChe > 59 || pBio > 59) {
			return "CONGRATS! You passed all your modules for the year!";
		} else {
			return "I'm sorry, you did not pass all your modules this year.";
		}
	}
	
}
