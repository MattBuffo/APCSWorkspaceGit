
public class MagicSquare {
	private int[][] square;
	/**
	 * Noargs Constructor
	 * 
	 * Constructs a 3x3 Magic Square
	 */
	public MagicSquare() {
		this(3);
	}
	/**
	 * 
	 * @param size
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
	
	private void fillSquare() {
		int size = square.length;
		int x = size /2; //x coordinate of the array, starts in the middle
		int y = 0; // y coordinate
		int number = 1;
		while(number <= (size * size)) { //checks to see if the current number is less than the maximum number in the array
			
			if(x >= size) {
				x = 0;
				System.out.println(x + "x");
			}
			else if(y < 0) {
				y = size -1;
				System.out.println(y + "y");
			}
			else if(square[x][y] == 0) {
				square[x][y] = number;
				System.out.println(square[x][y]);
				number ++;
				y--;
				x++;
				
			}
		}
	}
	/**Gets the magic sum of a magic square
	 * 
	 * @return sum determined by the formula for finding the magic constant 
	 */
	public int getSum() {
		int n = (square.length);
		return (n * ((n*n) +1))/2;
	}
	/** After square is initialized, returns the side length of the square
	 * 
	 * @return the size of the square
	 */
	public int getSize() {
		return square.length;
	}
	public String toString() {
		String temp = "";
		for(int[] array: square) {
			for(int i: array) {
				temp += i + "/t";
			}
			temp += "/n";  
		}
		return temp;
	}
}
