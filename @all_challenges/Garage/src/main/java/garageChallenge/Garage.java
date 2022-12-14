package garageChallenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public static List<Vehicle> garage = new ArrayList<>();

	public static void costOfRepairs() {
		for (Vehicle vehicle : getGarage()) {
			if (vehicle.type == "Car") {
				System.out.println("The cost of repairs for this car is GBP" + String.format("%.2f", Car.getCost()));
			}
			if (vehicle.type == "Motorbike") {
				System.out.println(
						"The cost of repairs for this bike is GBP" + String.format("%.2f", Motorbike.getCost()));
			}
			if (vehicle.type == "Lorry") {
				System.out
						.println("The cost of repairs for this Lorry is GBP" + String.format("%.2f", Lorry.getCost()));
			}
		}
	}

	public static void addVehicle(Vehicle vehicle) {
		getGarage().add(getGarage().size(), vehicle);
	}

	public static void removeVehicleByID(int VehicleID) {
		for (Vehicle vehicle : getGarage()) {
			if (vehicle.vehicleID == VehicleID) {
				getGarage().remove(vehicle);
				break;
			}
		}
	}

	public static void removeVehicleByType(String type) {
		for (Vehicle vehicle : getGarage()) {
			if (vehicle.type == type) {
				getGarage().remove(vehicle);
				break;
			}
		}
	}

	public static void removeVehicleByType(String type, int n) {
		while (n > 0) {
			for (Vehicle vehicle : getGarage()) {
				if (vehicle.type == type) {
					getGarage().remove(vehicle);
					n = n - 1;
					break;
				}
			}
		}
	}

	public static void fixVehicle(Vehicle vehicle) {
		if (vehicle.type == "Car") {
			System.out.println("\nThe bill for fixing " + vehicle.make + " " + vehicle.type + " is GBP"
					+ String.format("%.2f", Car.getCost()));
		} else if (vehicle.type == "Motorbike") {
			System.out.println("\nThe bill for fixing " + vehicle.make + " " + vehicle.type + " is GBP"
					+ String.format("%.2f", Motorbike.getCost()));
		} else if (vehicle.type == "Lorry") {
			System.out.println("\nThe bill for fixing " + vehicle.make + " " + vehicle.type + " is GBP"
					+ String.format("%.2f", Lorry.getCost()));
		}
	}

	public static void printGarage() {
		for (Vehicle vehicle : getGarage()) {
			System.out.println("\nDescription: " + vehicle.make + " " + vehicle.type + " with " + vehicle.transmission
					+ " transmission\nInternal ID: V9001-0" + vehicle.vehicleID);
		}
	}

	public static List<Vehicle> getGarage() {
		return garage;
	}

	public static void setGarage(List<Vehicle> garage) {
		Garage.garage = garage;
	}

}
