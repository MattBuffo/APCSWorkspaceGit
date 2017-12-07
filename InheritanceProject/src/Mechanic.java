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
		//Construction of polymorphic ArrayList of vehicles that simulates vehicles in a garage. 
		ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
		Garage.add(new Twingo("Home", 180000, 68, "Poor"));
		Garage.add(new RX7_FD("Home", 100000, 125, 270));
		System.out.println("Example inspection of all vehicles in a garage: \n");
		for(Vehicle v: Garage) {
			System.out.println(v);
		}
		
		
		
	}
	public void drive() {
		
	}
	public void repair() {
		
	}
	public void inspect() {
		
	}
}
