
public class Economy extends Car{
	public Economy(String brand, String location, int mileage, int topSpeed) {
		super(brand, location, mileage, topSpeed);
	}
	public void drive(String location, int miles) {
		super.addMiles(miles);
		super.setLocation(location);
		System.out.println("You drove" + miles + " miles to " + location + ",");
		double temp = Math.random();
		if(temp > 0.98) {
			this.breakDown();
			System.out.println("your car broke down on the way, unsurprisingly.");
		}
		else {
			System.out.println("the drive was tedious and boring.");
		}
	}
}
