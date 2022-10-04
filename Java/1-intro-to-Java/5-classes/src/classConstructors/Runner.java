package classConstructors;

//With having public variables within a public class, other classes can directly access the variables, including read and
//write abilities. This can have security issues, as well as risking causing problems with code as one class may interfere
//and manipulate another classes variables. 
//
//As a result, we can use the 'private' attribute with out variables, and then use getters and setters from other classes to
//call those variables as needed. As one might expect:
//Getters get (read) variables
//Setters set (write) variables
//'this.' is used with setters particularly to indicate we are referring to the current variables and not a new
//one
//Only including a getter means the module is read-only, and only using setters means it is write-only. This allows us to 
//have more control over permissions of code and as a result the security and stability is improved.4
//
//Additionally, one should have a specific runner class (for the purpose of QA this will always be called 'Runner') and then
//your other classes, with only the Runner having a main and being responsible for executing the code from other classes.
//
//Below, I will be adding several private attributes to this class which will be run from the Runner using getters and 
//setters. Constructors are required in non-runner classes so that we can give attributes to our objects - without the
//constructor, we can only create empty objects.

public class Runner {

	public static void main(String[] args) {
		Meal penneArrabbiata = new Meal("Penne Arrabbiate", 1, true, false, false, true);
		penneArrabbiata.printDish();
		Meal pepperoniPizza = new Meal("Pepperoni Pizza", 2, false, false, false, true);
		pepperoniPizza.printDish();
	}

}
