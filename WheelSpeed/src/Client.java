
public class Client {
	
	
	public static void main(String[] args) {
		double[] gears = {3.136, 1.888, 1.330, 1.000, 0.814};
		Drivetrain miata = new Drivetrain("Torque Converter", 0.053, gears, 18, "Mazda", 4.30);
		miata.setRPM(5000);
		miata.setGear(2);
		System.out.println(miata.getSpeed());}
}
