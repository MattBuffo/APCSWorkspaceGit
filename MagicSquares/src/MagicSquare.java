
public class MagicSquare {
	private int[][] square;
	public MagicSquare() {
	
	}
	public MagicSquare(int size) {
		square = new int[size][size];
		fillSquare();
		for(int[] array: square) {
			for(int i: array) {
				System.out.println(i);
			}
		}
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
}
