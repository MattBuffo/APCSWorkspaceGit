
public class Truck extends Vehicle {
	int towWeight;
	public Truck(String brand, String location, int mileage, int towWeight) {
		super(brand, location, mileage);
		this.towWeight = towWeight;
	}
	public String inspect(){
		String temp = "Vehicle: It's a ";
		temp += super.getBrand() + " ";
		temp += "but you can't tell the model.";
		temp += "Mileage: " + super.getMileage();
		temp += "It looks like it could pull about " + towWeight + " pounds";
		return temp;
	}
}
