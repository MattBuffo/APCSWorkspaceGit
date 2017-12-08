
public class Twingo extends Economy{
	String Condtion;
	/**
	 * Constructs a new renault twingo object tracking location, mileage, top speed, and condition
	 * @param location current location of twingo
	 * @param mileage current odometer reading
	 * @param topSpeed top speed of the vehicle
	 * @param Condition current condition of the vehicle
	 */
	public Twingo(String location, int mileage, int topSpeed, String Condition) {
		super("Renault", location, mileage, topSpeed);
		this.Condtion = Condition;
	}
	/**
	 * Humorous method used to demonstrate casting
	 * @return humorous message about cuddling twingos
	 */
	public String cuddle() {
		return "You cuddle the Twingo. \n"
				+ " Why?"
				+ " Some questions are best left unanswered.";
	}
	
	/**
	 * Returns a semi-accurate assessment of a twingo with some humorous elements added
	 * @return a complex string representing brand, vehicle name, mileage, location and condition.
	 * 
	 */
	public String inspect(){
		String temp = "Vehicle: ";
		temp += super.getBrand() + " ";
		temp += this.getClass().getSimpleName() + "\n";
		temp += "Mileage: " + super.getMileage() + "\n";
		temp += "Location: " + super.getLocation() + "\n";
		temp += "Top Speed: Really? \n";
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
