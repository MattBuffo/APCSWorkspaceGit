
public abstract class Vehicle {
	String brand;
	String location;
	int mileage;
	boolean broken;
	public Vehicle(String brand, String location, int mileage) {
		this.brand = brand;
		this.mileage = mileage;
		this.location = location;
	}
	//Getter Methods
	public String getBrand() {
		return brand;
	}
	public int getMileage() {
		return mileage;
	}
	public String getLocation() {
		return location;
	}
	public boolean isBroken() {
		return broken;
	}
	//Setter Methods
	public void changeLocation(String locus) {
		location = locus;
	}
	public void addMiles(int miles) {
		mileage += miles;
	}
	public void breakDown() {
		broken = true;
	}
	public abstract String inspect();
	public String toString() {
		return this.inspect();
	}
	public static String compareVehicle(Vehicle v1, Vehicle v2) {
		return "TODO";
	}
}
