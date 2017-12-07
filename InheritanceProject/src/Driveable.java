
public interface Driveable {
	/**
	 * Attempts to drive the vehicle to a given location a given number of miles
	 * @param location Place with which to update the superclass location variable
	 * @param miles Amount of miles to add to the virtual odometer represented by the superclass variable mileage.
	 */
	public void drive(String location, int distance);
}
