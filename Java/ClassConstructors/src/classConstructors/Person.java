package classConstructors;

public class Person {
	
	// Attributes
	String name;
	Integer age;
	String jobTitle;
	
	// Constructors	
	public Person() { //default constructor (empty)
	
	}
	
	public Person(String name, Integer age, String jobTitle) { // everything constructor (contains all attributes)
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	// Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getJob() {
		return this.jobTitle;
	}
	
	public void setJob(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	// Method for setting attribute to something
	public void unemployed() {
		setJob("*\n>>> *" +  this.getName() + " is unemployed or in full-time education");
	}
}
