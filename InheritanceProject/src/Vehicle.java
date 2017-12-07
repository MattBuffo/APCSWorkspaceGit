/**
 * Simulates a vehicle and tracks location, brand, mileage, and whether or not the vehicle is broken
 * @author Matt Buffo
 * @version alpha 0.1
 */
public abstract class Vehicle implements Comparable<Vehicle>{
	String brand;
	String location;
	int mileage;
	boolean broken;
	/**
	 * Construct a new vehicle with stored brand, location, and mileage
	 * @param brand
	 * @param location
	 * @param mileage
	 */
	public Vehicle(String brand, String location, int mileage) {
		this.brand = brand;
		this.mileage = mileage;
		this.location = location;
	}
	//Getter Methods
	/**
	 * Gets the brand of the vehicle
	 * @return brand local variable describing brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Gets the odometer reading of the vehicle
	 * @return mileage the ammount of miles on the vehicle 
	 */
	public int getMileage() {
		return mileage;
	}
	/**
	 * Gets the current location of a vehicle
	 * @return location instance variable
	 */
	public String getLocation() {
		return location;
	}
	/** Checks to see if the vehicle is broken
	 * 
	 * @return true if and only if the instance variable broken is true
	 */
	public boolean isBroken() {
		return broken;
	}
	//Setter Methods
	public void setLocation(String locus) {
		location = locus;
	}
	public void addMiles(int miles) {
		mileage += miles;
	}
	/**
	 * Causes the vehicle to break down, even if it is already broken
	 */
	public void breakDown() {
		broken = true;
	}
	/**
	 * Inspects the vehicle and returns what the mechanic can tell about that type of vehicle
	 * @return a complex multi-line string that describes brand, location, and/or mileage of the vehicle
	 */
	public abstract String inspect();
	/**
	 * Calls the inspection method
	 * @return the result of Vehicle.inspect();
	 */
	public String toString() {
		return this.inspect();
	}
	public static String compareVehicle(Vehicle v1, Vehicle v2) {
		return "TODO";
	}
	/**Compares the mileage of two vehicles 
	 * 
	 */
	public int compareTo(Vehicle v1) {
		return this.toString().compareTo(v1.toString());
	}
	/**
	 * Runs the toString method, which runs the inspect method, which returns a variety of information about a vehicle see this.inspect()
	 * @param v1 vehicle to compare this instance of vehicle to
	 * @return true if and only if the result of the inspect methods of both objects are equal
	 */
	public boolean equals(Vehicle v1) {
		return this.toString().equals(v1.toString());
	}
}
