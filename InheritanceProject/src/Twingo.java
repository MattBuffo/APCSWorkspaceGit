
public class Twingo extends Economy{
	String Condtion;
	
	public Twingo(String location, int mileage, int topSpeed, String Condition) {
		super("Renault", location, mileage, topSpeed);
		this.Condtion = Condition;
	}
	public String inspect(){
		String temp = "Vehicle: ";
		temp += super.getBrand() + " ";
		temp += this.getClass().getSimpleName() + "\n";
		temp += "Mileage: " + super.getMileage() + "\n";
		temp += "Location: " + super.getLocation() + "\n";
		temp += "Top Speed: Really?";
		temp += "Condition: " + this.Condtion + "\n"; 
		if(super.isBroken()) {
			temp += "DO NOT DRIVE THIS VEHICLE \n DO NOT DRIVE THIS VEHICLE \n DO NOT DRIVE THIS VEHICLE \n";
		}
		else{
			temp += "It's happy to see you \n";
			}
		return temp;
	}
	
}
