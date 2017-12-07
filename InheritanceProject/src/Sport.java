
public class Sport extends Car{
	int horsePower;
	public Sport(String brand, String location, int mileage, int topSpeed, int horsePower) {
		super(brand, location, mileage, topSpeed);
		this.horsePower = horsePower;
	}
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
