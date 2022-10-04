package qa.com.inheritance;

public class Runner {


	public static void main(String[] args) {
		Cat Poppy = new Cat();
		Poppy.description();
		Poppy.laysEgg();
		System.out.println("\nI hope you enjoyed these facts about " + Poppy.getSpecies() +"s. Did you learn something new?");

	}

}
