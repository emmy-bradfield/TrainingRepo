package personSolutions;

public abstract class Person{
	
	String name;
	Integer age;
	String job;
	
	public Person() {}
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJob(String job) {
		this.job = job;
	}

	public abstract String personString();
	

}
