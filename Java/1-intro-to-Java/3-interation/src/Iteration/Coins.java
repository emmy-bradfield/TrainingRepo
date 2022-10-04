package Iteration;

public class Coins {
	public static double paid, change, i, j, n;

	public static void main(String[] args) {
		change(345.73, 193.01);
		System.out.println("You receieve the following change:");
		tenner();
		fiver();
		quid();
		fiftyP();
		twentyP();
		tenP();
		fiveP();
		twoP();
		penny();
	}

	public static double change(double paid, double cost) {
		change = paid - cost;
		return change;
	}

	public static void tenner() { 
		j = 0; 
		for (i = change; i > 0; i -= 10) { 
			if (i - 10 >= 0) { 
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x £10 notes"); // the system outputs iteration number and " x £10 notes"
		}
		change = change - (j * 10); // the value of change 
	}

	public static void fiver() {
		j = 0;
		for (i = change; i > 0; i -= 5) {
			if (i - 5 >= 0) {
				j += 1;
			}
		}
		if ( j > 0) {
		System.out.println(j + " x £5 notes");
		}
		change = change - (j * 5);
	}

	public static void quid() {
		j = 0;
		for (i = change; i > 0; i -= 1) {
			if (i - 1 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x £1 coins");
		}
		change = change - (j * 1);
	}

	public static void fiftyP() {
		j = 0;
		for (i = change; i > 0; i -= 0.5) {
			if (i - 0.5 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x 50p coins");
		}
		change = change - (j * 0.5);
	}

	public static void twentyP() {
		j = 0;
		for (i = change; i > 0; i -= 0.2) {
			if (i - 0.2 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x 20p coins");
		}
		change = change - (j * 0.2);
	}

	public static void tenP() {
		j = 0;
		for (i = change; i > 0; i -= 0.1) {
			if (i - 0.1 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x 10p coins");
		}
		change = change - (j * 0.1);
	}

	public static void fiveP() {
		j = 0;
		for (i = change; i > 0; i -= 0.05) {
			if (i - 0.05 >= 0) {
				j += 1;
			}
		}
		if ( j > 0) {
		System.out.println(j + " x 5p coins");
		}
		change = change - (j * 0.05);
	}

	public static void twoP() {
		j = 0;
		for (i = change; i > 0; i -= 0.02) {
			if (i - 0.02 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x 2p coins");
		}
		change = change - (j * 0.02);
	}

	public static void penny() {
		j = 0;
		for (i = change; i > 0; i -= 0.01) {
			if (i - 0.01 >= 0) {
				j += 1;
			}
		}
		if (j > 0) {
		System.out.println(j + " x pennies");
		}
		change = change - (j * 0.01);
	}
}
