
public class Transmission {
	private String type; //Manual, Torque Converter, CVT, SMT, DCT, etc.
	private double lossRatio; //Estimated total drivetrain loss
	private double[] gearing; //Gear Ratios
	
	
	public Transmission(String kind, double ratio, double[] gears) {
		type = kind;
		lossRatio = ratio;
		gearing = gears;
	}
	
	public String getType() {
		return type;
	}
	public double getLoss() {
		return lossRatio;
	}
	public double getGearing(int gear) {
		if(gear >=0 && gear < gearing.length) {
			return gearing[gear];
		}
		else return -1;
	}
	
}
