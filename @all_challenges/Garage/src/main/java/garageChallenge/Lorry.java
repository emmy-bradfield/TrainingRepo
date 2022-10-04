package garageChallenge;

public class Lorry extends Vehicle{

	Integer size;
	static Double Cost;
	
	public Lorry(String make, String transmission, Integer size, Integer vehicleID) {
		super(make, transmission, vehicleID);
		type = "Lorry";
		this.size = size;
		costOfRepairs();
	}
	
	public static Double getCost() {
		return Cost;
	}

	@Override
	public Double costOfRepairs() {
		Cost  = 200.00;
		if (size >= 10) {
			Cost = Cost*2;
		}
		if (make == "Mercedes") {
			Cost = Cost*1.2;
		}
		if (transmission == "Manual") {
			Cost = Cost - 100;
		}
		return Cost;
	}

}
