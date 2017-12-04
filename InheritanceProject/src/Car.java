
public class Car extends Vehicle implements Driveable{
	int topSpeed;
	public Car(String brand, String location, int mileage, int topSpeed) {
		super(brand, location, mileage);
		this.topSpeed = topSpeed;
	}
	public String inspect(){
		String temp = "Vehicle: ";
		temp += super.getBrand() + " ";
		temp += this.getClass().getSimpleName() + "\n";
		temp += "Mileage: " + super.getMileage() + "\n";
		temp += "Location: " + super.getLocation() + "\n";
		temp += "Top Speed: " + this.topSpeed + "\n";
		return temp;
	}
	public void drive(String location, int miles) {
		super.addMiles(miles);
		super.changeLocation(location);
		System.out.println("You drove" + miles + " miles to " + location + ",");
		double temp = Math.random();
		if(temp > 0.95) {
			this.breakDown();
			System.out.println("your car broke down on the way.");
		}
		else {
			System.out.println("the drive was uneventful.");
		}
	}
}
