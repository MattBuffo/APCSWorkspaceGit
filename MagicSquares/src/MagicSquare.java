/**
 * 
 * @author Matt Buffo
 * Simulates a magic square, a form of mathematical puzzle using a 2D array of integers
 *
 */
public class MagicSquare {
	private int[][] square; //simulated magic square 
	/**
	 * Noargs Constructor
	 * 
	 * Constructs a 3x3 Magic Square
	 */
	public MagicSquare() {
		this(3);
	}
	/** Creates a magic square of with dimensions equal to a passed value unless
	 *  <ul><li>The value is less than three, in which case a 3x3 square is created</li>
	 *  <li>The value is more than three and even, in which a (n+1)*(n+1) array is created where n is the passed integer</li>
	 * 	</ul>
	 * @param size size of the square to create
	 */
	public MagicSquare(int size) {
		if(size < 3) {
			size = 3;
		}
		else if(size%2 == 0){
			size = size +1;
		}
		square = new int[size][size];
		fillSquare();
		
	}
	/**
	 * Fills an odd-number-sided magic square with numbers, square must have already been initialized to an array with congruent odd dimensions
	 * Postcondition: Magic square filled according to given algorithm
	 */
	private void fillSquare() {
		int size = square.length;
		int xval = size /2; //x coordinate of the array, starts in the middle
		int yval = 0; //y coordinate
		int number = 1;
		while(number <= (size * size)) { //checks to see if the current number is less than the maximum number in the array
			
			if(xval >= size) {
				xval = xval - size;
				}
			else if(xval < 0) {
				xval =  size + xval;
			}
			else if(yval >= size) {
				yval = yval - size;
			}
			else if(yval < 0) {
				yval = size +yval;
				}
			else if(square[yval][xval] == 0) {
				square[yval][xval] = number;
				number ++;
				yval --;
				xval++;			
			}
			else {
				yval = yval +2;
				xval --;
			}
		}
	}
	/**Gets the magic sum of a filled magic square
	 * 
	 * @return sum determined by the formula for finding the magic constant as found on totally reputable internet source (unnamed)
	 */
	public int getSum() {
		int n = (square.length);
		return (n * ((n*n) +1))/2;
	}
	/** After square is initialized and filled, returns the side length of the square
	 * 
	 * @return the size of the square
	 */
	public int getSize() {
		return square.length;
	}
	/** Returns a legible version of a already initialized and filled square
	 *  
	 * @return complex multi-line string with square values separated by tabs
	 */
	public String toString() {
		String temp = "";
		for(int[] array: square) {
			for(int i: array) {
				temp += i + "\t";
			}
			temp += "\n";  
		}
		return temp;
	}
	/** Checks to see if a magic square is valid by checking to see if each row, column, and diagonal of the square equal the magic sum
	 * 
	 * @return true if and only if each row, column, and diagonal equals the magic sum
	 */
	public boolean validSquare() {
		int sum = this.getSum();
		int temp = 0;
		for(int[] array: square) { // checks each row against the magic sum
			for(int i: array) {
				temp += i;
			}
			if(temp != sum) return false;
			temp = 0;
		}
		
		for(int i = 0; i < square.length; i++) { //checks each column against the magic sum
			for(int j = 0; j < square.length; j++) {
				temp += square[j][i];
			}
			if(temp != sum) return false;
			temp = 0;
		}
		
		for(int i =0; i<square.length; i++){//checks the right diagonal
			temp += square[i][i];
		}
		if(temp != sum){
			return false;
		}
		else {
			temp = 0;
		}
		
		for(int i = square.length - 1; i >= 0; i--) {//checks the left diagonal
			temp += square[i][i];
		}
		if(temp != sum){
			return false;
		}
		else {
			temp = 0;
		}
		
		return true;
	}
}
