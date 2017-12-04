
public class Other extends Vehicle{
	public Other(String brand, String location, int mileage) {
		super(brand, location, mileage);
	}
	public String inspect(){
		String temp = "Vehicle: It's a ";
		temp += super.getBrand() + " ";
		temp += "but you can't tell the model.";
		temp += "Mileage: Where even is the odometer on this thing?";
		return temp;
	}
}
