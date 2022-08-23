package com.qa.people;

public abstract class Person {

	// Object attributes
	String name;
	Integer age;
	String jobTitle;

	// Class constructors (default and everything)
	public Person() {
	}

	public Person(String name, int age, String jobTitle) {
		this.setName(name);
		this.setAge(age);
		this.setJobTitle(jobTitle);
	}
	
	public abstract String toString();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
