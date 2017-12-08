/**
 * Simulates a vehicle and tracks location, brand, mileage, and whether or not the vehicle is broken
 * @author Matt Buffo
 * @version alpha 0.1
 */
public abstract class Vehicle implements Comparable<Vehicle>, Repairable{
	String brand;
	String location;
	int mileage; //sometimes referred to as "odometer" in other comments as it simulates a cars odometer
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

	/**
	 * Sets the vehicles location to another location without adding any miles to odometer, could be used to simulate towing
	 * @param locus location to change current vehicle location to
	 */
	public void setLocation(String locus) {
		location = locus;
	}

	/**
	 * Sole mutator method for mileage variable that adds miles to the odometer as any other modification would be illegal under US Federal Law
	 * @param miles mileage to add to odometer
	 */
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
	 * Repairs the vehicle by changing the broken variable to false
	 * 
	 */
	public void repair() {
		this.broken = false;
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
		return inspect();
	}

	/**
	 * Compares two vehicles based on a variety of characteristics 
	 * @param v1
	 * @param v2
	 * @return complex multi-line string comparing vehicles based on name, brand, location and mileage
	 */
	public static String compareVehicle(Vehicle v1, Vehicle v2) {
		return "NAME \n "
				+ "Vehicle 1:" + v1.getClass().getSimpleName() + "\n"
				+ "Vehicle 2:" + v2.getClass().getSimpleName() + "\n"
				+ "BRAND \n"
				+ "Vehicle 1:" + v1.getBrand() + "\n"
				+ "Vehicle 2:" + v2.getBrand() + "\n"
				+ "LOCATION \n"
				+ "Vehicle 1:" + v1.getLocation() + "\n"
				+ "Vehicle 2:" + v2.getLocation() + "\n"
				+ "MILEAGE \n"
				+ "Vehicle 1:" + v1.getMileage() + "\n"
				+ "Vehicle 2:" + v2.getMileage() + "\n"
				;
	}

	/**Compares the mileage of two vehicles 
	 * @return the difference between the invoking object's mileage and the passed object's mileage
	 */
	public int compareTo(Vehicle v1) {
		return this.getMileage() - v1.getMileage();
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
