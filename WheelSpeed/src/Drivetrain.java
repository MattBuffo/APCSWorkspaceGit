
public class Drivetrain {
	private Differential diff;
	private Transmission tranny;
	private Tachometer tach;
	private Wheel rims;
	private int currentGear = 1;
	
	public Drivetrain(String transmissionType, double loss, double[] gearing, double radius, String wheelBrand, double diffRatio) {
		diff = new Differential(4.30);
		tranny = new Transmission(transmissionType, loss, gearing);
		rims = new Wheel(radius, wheelBrand);
		diff = new Differential(diffRatio);
		tach = new Tachometer(0);
		
	}
	public void setRPM(int revs) {
		tach.setRPM(revs);
	}
	public int getRPM() {
		return tach.getRPM();
	}
	public void setGear(int gear) {
		currentGear = gear;
	}
	public int getGear() {
		return currentGear;
	}
	/**
	 * Precondition: RPM Must be set
	 * @return Speed based on mechanical calculations
	 */
	public double getSpeed() {
		return ((double)tach.getRPM() / (tranny.getGearing(currentGear - 1)) / (diff.getGearing()) * (tranny.getLoss()) //Crank to Wheel RPM
					* (Math.PI * (Math.pow((double)rims.getRadius(), 2))) / (12.0 /*In to feet*/ * 5280 /*Feet to Mile*/)//Wheel RPM to Miles/min
					*60//min to hr
				);
	}
}
