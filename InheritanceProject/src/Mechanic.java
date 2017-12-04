import java.util.ArrayList;

public class Mechanic {
	private static ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
	public static void main(String[] args) {
		Garage.add(new Twingo("Home", 180000, 68, "Poor"));
		Garage.add(new RX7_FD("Home", 100000, 125, 270));
		for(Vehicle v: Garage) {
			System.out.println(v);
		}
	}
	private void drive() {
		
	}
}
