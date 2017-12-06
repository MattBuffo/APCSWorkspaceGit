import java.util.ArrayList;
import java.util.Scanner;
public class Mechanic {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
		Garage.add(new Twingo("Home", 180000, 68, "Poor"));
		Garage.add(new RX7_FD("Home", 100000, 125, 270));
		for(Vehicle v: Garage) {
			System.out.println(v);
		}
		System.out.println("Hello, and welcome to your garage! \n "
				+ "What would you like to do today (enter lowercase word) \n"
				+ "inspect \n"
				+ "drive \n"
				+ "repair");
		Boolean tempGoodbye = false;
		
	}
}
