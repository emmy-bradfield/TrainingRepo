package garageChallenge;

public class Car extends Vehicle {

	Integer age;
	static Double Cost;

	public Car(String make, String transmission, Integer age, Integer vehicleID) {
		super(make, transmission, vehicleID);
		type = "Car";
		this.age = age;
		costOfRepairs();

	}
	
	public static double getCost() {
		return Cost;
	}

	@Override
	public Double costOfRepairs() {
		Cost = 50.00;
		if (age >= 10) {
			Cost = Cost + 50;
		}
		if (make == "Ford") {
			Cost = Cost/1.5;
		} else if (make == "BMW") {
			Cost = Cost/0.5;
		}
		if (transmission == "Automatic") {
			Cost = Cost + 100;
		}
		return Cost;
	}
}
