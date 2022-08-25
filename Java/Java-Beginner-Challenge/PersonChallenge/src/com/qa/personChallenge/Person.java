package com.qa.personChallenge;

import java.util.Scanner;

public class Person extends People {

	private String name;
	private Integer age;
	private String job;

	public Person() {
	}

	public Person(String name, int age, String job) {
		this.setName(name);
		this.setAge(age);
		this.setJob(job);
	}

	@Override
	public String makeString() {
		String details = (getName() + " is " + getAge() + " years old and works as a " + getJob() + "\n\n");
		return details;
	}

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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
