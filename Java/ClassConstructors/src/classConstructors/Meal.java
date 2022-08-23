package classConstructors;

public class Meal {

	// Attributes
	private String dish;
	private Integer serves;
	private Boolean dietV;
	private Boolean dietVG;
	private Boolean dietGF;
	private Boolean dietNF;

	// Default constructor
	public Meal() {

	}

	// Everything constructor
	public Meal(String dish, Integer serves, Boolean dietV, Boolean dietVG, Boolean dietGF, Boolean dietNF) {
		this.dish = dish;
		this.serves = serves;
		this.dietV = dietV;
		this.dietVG = dietVG;
		this.dietGF = dietGF;
		this.dietNF = dietNF;
	}

	// Getters
	public String getDish() {
		return this.dish;
	}

	public int getPortion() {
		return this.serves;
	}

	public boolean getV() {
		return this.dietV;
	}

	public boolean getVG() {
		return this.dietVG;
	}

	public boolean getGF() {
		return this.dietGF;
	}

	public boolean getNF() {
		return this.dietNF;
	}

	// Setters
	public void setDish(String dish) {
		this.dish = dish;
	}

	public void setPortion(Integer serves) {
		this.serves = serves;
	}

	public void setV(Boolean dietV) {
		this.dietV = dietV;
	}

	public void setVG(Boolean dietVG) {
		this.dietVG = dietVG;
	}

	public void setGF(Boolean dietGF) {
		this.dietGF = dietGF;
	}

	public void setNF(Boolean dietNF) {
		this.dietNF = dietNF;
	}

	public String veg() {
		if (this.getV() == true) {
			String V = "yes";
			return V;
		} else {
			String V = "no";
			return V;
		}
	}

	public String VG() {
		if (this.getVG() == true) {
			String VG = "yes";
			return VG;
		} else {
			String VG = "no";
			return VG;
		}
	}

	public String GF() {
		if (this.getGF() == true) {
			String GF = "yes";
			return GF;
		} else {
			String GF = "no";
			return GF;
		}
	}

	public String NF() {
		if (this.getNF() == true) {
			String NF = "yes";
			return NF;
		} else {
			String NF = "no";
			return NF;
		}
	}

	public void printDish() {
		String Meal = ("====" + this.getDish().toUpperCase() + "====\nServes " + this.getPortion() + "\n");
		String Info = ("Vegetarian: " + veg() + "\nVegan: " + VG() + "\n" + "Gluten Free: " + GF() + "\n" + "Nut Free: " + NF() + "\n");
		System.out.print(Meal + Info + "\n");
	}
}
