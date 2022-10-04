package qa.com.inheritance;

public class Mammal {
	
	// Attributes
	private String type = "mammal";
	private String egg = "No";
	private String breathes = "lungs";
	private String feedsYoung = "milk";
	
	
	// Getters and Setters
	public String getEgg() {
		return egg;
	}
	
	public String getBreathes() {
		return breathes;
	}
	
	public String getFeeds() {
		return feedsYoung;
	}
	
	public String getType() {
		return type;
	}
	
	public void setEgg() {
		this.egg = egg;
	}
	
	public void setBreaths() {
		this.breathes = breathes;
	}
	
	public void setFeeds() {
		this.feedsYoung = feedsYoung;
	}
	
	public void laysEgg() {
		System.out.println("Do they lay eggs?");
		System.out.println(">>" + this.getEgg() + ", as they are " + this.getType() + "s!"
				+ "\nDo you know how they feed their children? \n>> They feed them " + this.getFeeds() + ", how cool!");
	}
}
