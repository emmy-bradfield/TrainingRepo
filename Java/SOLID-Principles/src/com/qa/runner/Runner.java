package com.qa.runner;

import java.util.ArrayList;
import java.util.List;

import com.qa.dependencyinversion.BackendDeveloper;
import com.qa.dependencyinversion.Developer;
import com.qa.dependencyinversion.FrontendDeveloper;
import com.qa.dependencyinversion.Project;
import com.qa.interfacesegregation.Dodo;
import com.qa.interfacesegregation.Falcon;
import com.qa.liskovsubstitution.BedroomAdder;
import com.qa.liskovsubstitution.ManyRoom;
import com.qa.liskovsubstitution.OneRoom;
import com.qa.liskovsubstitution.Penthouse;
import com.qa.liskovsubstitution.Studio;
import com.qa.openclosed.CasualGreeting;
import com.qa.openclosed.FormalGreeting;
import com.qa.openclosed.Greeter;
import com.qa.openclosed.Greeting;
import com.qa.openclosed.Speech;
import com.qa.singleresponsibility.Car;
import com.qa.singleresponsibility.Driver;
import com.qa.singleresponsibility.Mechanic;

public class Runner {

	public static void singleResponsibility() {
		System.out.println("");
		System.out.println("---------------------------1---------------------------");
		System.out.println("");
		Car J444CEB = new Car("silver", "Ford Focus", 92000);
		Driver Emily = new Driver("Emily", 1000);
		Emily.purchaseCar(J444CEB);
		System.out.println(Emily.getName() + " purchased a " + J444CEB.carDetails());
		Emily.drive(265, J444CEB);
		System.out.println(Emily.getName() + " then drove it for " + Emily.getDrive() + " miles.");
		Mechanic Dave = new Mechanic("Dave");
		Dave.addSpoiler(J444CEB);
		Dave.repaint("purple", J444CEB);
		Dave.getCost();
		System.out.println("The mechanic, " + Dave.getName() + ", added a spoiler and repainted " + Emily.getName()
				+ "'s car.");
		System.out.println(Emily.getName() + " had £" + Emily.getMoney() + " and " + Dave.getName() + " cost £"
				+ Dave.getCost() + ".");
		Emily.payMechanic(Dave);
		System.out.println("After paying " + Dave.getName() + ", " + Emily.getName() + " has £" + Emily.getMoney()
				+ " and a " + J444CEB.carDetails());
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void openClosed() {
		System.out.println("---------------------------2---------------------------");
		System.out.println("");
		 Speech formal = new FormalGreeting(); Greeter.sayHello(formal); 
		 Speech casual = new CasualGreeting(); Greeter.sayHello(casual); 
		 Speech basic = new Greeting(); Greeter.sayHello(basic);
		 System.out.println("");
		 System.out.println("------------------------------------------------------");
		 System.out.println("");
		 System.out.println("");
	}

	public static void liskovSubstitution() {
		System.out.println("---------------------------3---------------------------");
		System.out.println("");
		OneRoom roseHome = new Studio("Portswood Road", 200); ManyRoom emmyHome = new
		Penthouse("Moreton Road", 500, 2); BedroomAdder moreRooms = new
		BedroomAdder(); moreRooms.makeBigger(roseHome); moreRooms.addRoom(emmyHome);
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("");

	}

	public static void interfaceSegregation() {
		System.out.println("---------------------------4---------------------------");
		System.out.println("");
		Falcon falcon = new Falcon(2);
		falcon.setCurrentLocation("in their nest");
		System.out
				.println("The falcon has " + falcon.getNumberOfEggs() + " eggs, and is " + falcon.getCurrentLocation());
		falcon.layEggs();
		System.out.println("The falcon has laid an egg, and now has " + falcon.getNumberOfEggs() + " eggs!");
		falcon.fly();
		System.out.println("The falcon takes flight, and is now " + falcon.getCurrentLocation());
		Dodo dodo = new Dodo(0);
		dodo.setCurrentLocation("in their nest");
		System.out.println("The dodo has " + dodo.getNumberOfEggs() + " eggs and is " + dodo.getCurrentLocation());
		dodo.layEggs();
		System.out.println("The dodo has laid an egg, and now has " + dodo.getNumberOfEggs() + " egg!");
		dodo.goExtinct();
		System.out.println("Uh oh! The dodo went extinct and is now " + dodo.getCurrentLocation());
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}
	
	public static void dependencyInversion() {
		System.out.println("---------------------------5---------------------------");
		System.out.println("");
		BackendDeveloper Sue = new BackendDeveloper();
		FrontendDeveloper Bianca = new FrontendDeveloper();
		List<Developer> appBuilding = new ArrayList<>();
		appBuilding.add(Sue);
		appBuilding.add(Bianca);
		Project database = new Project(appBuilding);
		database.implement();
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("");
	}

	public static void main(String[] args) {
		singleResponsibility();
		openClosed();
		liskovSubstitution();
		interfaceSegregation();
		dependencyInversion();

	}
}
