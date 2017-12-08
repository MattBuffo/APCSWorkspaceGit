
public class Sport extends Car{
	int horsePower;
	/**
	 * Constructs a new sports car object which tracks brand, location, mileage, top speed and horsepower
	 * @param brand brand of the vehicle
	 * @param location current vehicle location
	 * @param mileage current odometer reading
	 * @param topSpeed top speed of the vehicle
	 * @param horsePower amount of horsepower of the vehicle
	 */
	public Sport(String brand, String location, int mileage, int topSpeed, int horsePower) {
		super(brand, location, mileage, topSpeed);
		this.horsePower = horsePower;
	}
	/**
	 * 
	 */
	public void drive(String location, int miles) {
		super.addMiles(miles);
		super.setLocation(location);
		System.out.println("You drove" + miles + " miles to " + location + ",");
		double temp = Math.random();
		if(temp > super.breakDownChance) {
			this.breakDown();
			System.out.println("your car broke down on the way but you had fun regardless.");
		}
		else {
			System.out.println("the drive was fantastic and you feel alive.");
		}
	}
}
