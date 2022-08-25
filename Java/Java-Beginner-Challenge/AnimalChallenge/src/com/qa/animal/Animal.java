package com.qa.animal;
import com.qa.interfaces.*;

public abstract class Animal implements Age, LifeExpectancy{
	
	private Integer size;
	private String look;
	private String habitat;
	private Integer age;
	private Integer life;
	
	public Animal() {};
	
	public Animal(int size, String look, String habitat, int age, int life) {
		super();
		this.size = size;
		this.look = look;
		this.habitat = habitat;
		this.age = age;
		this.life = life;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getLook() {
		return look;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setLook(String look) {
		this.look = look;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public abstract String makeString();
	
	public abstract void print();
}
