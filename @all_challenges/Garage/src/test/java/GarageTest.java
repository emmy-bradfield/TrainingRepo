import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import garageChallenge.Car;
import garageChallenge.Garage;
import garageChallenge.Lorry;
import garageChallenge.Motorbike;
import garageChallenge.Runner;
import garageChallenge.Vehicle;

public class GarageTest {

	@Test
	public void itemsInList() {
		assertFalse("No items have been added", Garage.garage.contains(null));
	}

	@Test
	public void addVehciles() {
		Vehicle passCar = new Car("make", "transmission", 1, 10);
		Vehicle passBike = new Motorbike("make", "transmission", 125, 12);
		Vehicle passLorry = new Lorry("make", "transmission", 10000, 14);
		Garage.addVehicle(passCar);
		Garage.addVehicle(passBike);
		Garage.addVehicle(passLorry);
		assertTrue("pass Car has not been added", Garage.garage.contains(passCar));
		assertTrue("pass Bike has not been added", Garage.garage.contains(passBike));
		assertTrue("pass Lorry has not been added", Garage.garage.contains(passLorry));
	}

	@Test
	public void vehicleRemoved() {
		Vehicle passLorry = new Lorry("make", "transmission", 10000, 14);
		Garage.addVehicle(passLorry);
		Vehicle passBike = new Motorbike("make", "transmission", 125, 12);
		Garage.addVehicle(passBike);
		Vehicle passCar = new Car("make", "transmission", 1, 10);
		Garage.addVehicle(passCar);
		Garage.removeVehicleByID(10);
		Garage.removeVehicleByID(12);
		Garage.removeVehicleByID(14);
		assertFalse("pass Car has not been added", Garage.garage.contains(passCar));
		assertFalse("pass Bike has not been added", Garage.garage.contains(passBike));
		assertFalse("pass Lorry has not been added", Garage.garage.contains(passLorry));

	}

	@Test
	public void findsCost() {
		Double testCost = 0.00;
		Vehicle fixCar = new Car("BMW", "Automatic", 12, 20);
		Garage.addVehicle(fixCar);
		Garage.fixVehicle(fixCar);
		testCost = Car.getCost();
		;
		assertTrue("Costs do not match", testCost == 500);

		Vehicle fixbike = new Motorbike("Harley Davidson", "Automatic", 255, 10);
		Garage.addVehicle(fixbike);
		Garage.fixVehicle(fixbike);
		testCost = Motorbike.getCost();
		assertTrue("Costs do not match", testCost == 155.56);
		
		
	}

}
