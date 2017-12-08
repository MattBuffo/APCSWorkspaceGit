/**
 * @author Matt Buffo
 * Demo version of class functionality, used for marketing purposes
 * Simplates a garage where you are the mechanic with the ability to repair, drive, and inspect vehicles
 * @version alpha test
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Mechanic {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		//Construction of polymorphic Array of vehicles that simulates vehicles in a garage. 
		Vehicle[] Garage = new Vehicle[3];
		Garage[0] = new Twingo("Home", 180000, 68, "Poor");
		Garage[1] = new RX7_FD("Home", 100000, 125, 270);
		Garage[2] = new Other("Hurricane","Home",25);
		
		System.out.println("Example inspection of all vehicles in a garage: \n");
		for(Vehicle v: Garage) {
			System.out.println(v);
		}
		
		System.out.println("Cuddle with a car: \n");
		cuddle(Garage);
	
	}
	/**
	 * Helper method that cuddles cars if they are Twingos. Yeah
	 * @param vehicles polymorphic array of vehicles
	 */
	private static void cuddle(Vehicle[] vehicles) {
		for(Vehicle v: vehicles) {
			if(v instanceof Twingo) {
				System.out.println(((Twingo) v).cuddle());
			}
		}
	}
}
