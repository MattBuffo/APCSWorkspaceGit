/**
 * Simulated die with face element and ability to be rolled to a random face
 * @author Matt Buffo
 * @version alpha 0.2
 * 
 *
 */
public class die {
	private int face; // intance data
	private int sides;
	/**
	 * Constructor that rolls dice with six sides, noargs constructor
	 */
	public die() { //constructor
		sides = 6;
		face = roll();
	}
	/**Creates a die with a certian number of sides
	 * 
	 * @param faces number of sides on desired die 
	 */
	public die(int faces) {
		sides = faces;
		face = roll();
	}
	/**Compares the face of a die paramater to the face of the die the method is invoked on
	 * 
	 * @param die2 another instance of die 
	 * @return
	 */
	public boolean isDoubles(die die2) {
		return (face == die2.currentFace());
	}
	/** Sets face to an integer between 1 and 6 inclusive and returns that integer
	 * 
	 * @return new value of face
	 */
	public int roll() { //class method
		face = (int)(Math.random() * sides +1);
		return face;
	}
	/** Returns the current face
	 * 
	 * @return face
	 */
	public int currentFace() {
		return face;
	}
	/**
	 * Returns the current face of the die as a string
	 * @return the value of face as a string
	 */
	public String toString() { //toString method
		String temp = "" + face;
		return temp;
	}
	
}
