/**
 *  
 * @author Matt Buffo
 * @version alpha 0.1
 * Child class of vehicle, implements drivable interface
 * Simulates a car and tracks brand, mileage, current location, and top speed
 */
public class Car extends Vehicle implements Driveable{
	private int topSpeed;
	public final double breakDownChance = 0.95; //final data
	
	/**
	 * Constructs a new Car object with stored brand, location, mileage, and top speed
	 * @param brand brand of car
	 * @param location current location of car
	 * @param mileage number of miles on the odometer
	 * @param topSpeed top speed of the vehicle
	 */
	public Car(String brand, String location, int mileage, int topSpeed) {
		super(brand, location, mileage);
		this.topSpeed = topSpeed;
	}
	
	/**
	 * Inspects a vehicle and returns all discernable information about that vehicle
	 * @return String that represents a multi-line statement about the state of a vehicle
	 */
	public String inspect(){
		String temp = "Vehicle: ";
		temp += super.getBrand() + " ";
		temp += this.getClass().getSimpleName() + "\n";
		temp += "Mileage: " + super.getMileage() + "\n";
		temp += "Location: " + super.getLocation() + "\n";
		temp += "Top Speed: " + this.topSpeed + "\n";
		return temp;
	}
	
	
	/**
	 * Attempts to drive the vehicle to a given location a given number of miles
	 * @param location Place with which to update the superclass location variable
	 * @param miles Amount of miles to add to the virtual odometer represented by the superclass variable mileage.
	 */
	public void drive(String location, int miles) {
		super.addMiles(miles);
		super.setLocation(location);
		System.out.println("You drove" + miles + " miles to " + location + ",");
		
		//Implements a random breakdown mechanic based on a class constant
		
		double temp = Math.random();
		if(temp > breakDownChance) {
			this.breakDown();
			System.out.println("your car broke down on the way.");
		}
		else {
			System.out.println("the drive was uneventful.");
		}
	}
}
