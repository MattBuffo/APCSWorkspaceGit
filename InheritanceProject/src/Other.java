/**
 * Simulates a unspecified type of vehicle
 * @author Matt
 *
 */
public class Other extends Vehicle{
	/**
	 * Constructs a new other object that tracks brand, location, and mileage of the vehicle
	 * @param brand brand of the vehicle	
	 * @param location current location of the vehicle
	 * @param mileage number of miles the vehicle has traveled since manufacture
	 */
	public Other(String brand, String location, int mileage) {
		super(brand, location, mileage);
	}
	/**
	 * inspects the other vehicle and reports limited information
	 * @return complex string that represents the vehicle brand and some other fluff
	 */
	public String inspect(){
		String temp = "Vehicle: It's a ";
		temp += super.getBrand() + " ";
		temp += "but you can't tell the model.";
		temp += "Mileage: Where even is the odometer on this thing?";
		return temp;
	}
}
