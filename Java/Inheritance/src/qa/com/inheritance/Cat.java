package qa.com.inheritance;

public class Cat extends Mammal {
	
	// Attributes
	private String species = "cat";
	private String fur = "furry";
	private int legs = 4;
	
	// Getters and Setters
	public String getSpecies() {
		return species;
	}
	
	public String getFur() {
		return fur;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setSpecies() {
		this.species = species;
	}
	
	public void setFur() {
		this.fur = fur;
	}
	
	public void setLegs() {
		this.legs = legs;
	}
	
	public void description() {
		System.out.println("Here are some facts all about " + species + "s!\n");
		System.out.println("What do they look like?");
		System.out.println(">> They have " + this.legs + " legs and are " + fur + ".");
	}
}
