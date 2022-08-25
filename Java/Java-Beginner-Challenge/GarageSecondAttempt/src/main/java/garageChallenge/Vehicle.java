package garageChallenge;

public abstract class Vehicle {
	
	String type;
	String make;
	String transmission;
	Integer vehicleID;
	
	public Vehicle(String make, String transmission, Integer vehicleID) {
		this.make = make;
		this.transmission = transmission;
		this.vehicleID = vehicleID;

	}
	
	public abstract Double costOfRepairs(); 
	
}
