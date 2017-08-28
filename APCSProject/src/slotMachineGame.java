import java.util.Arrays;
import java.util.Scanner;
public class slotMachineGame{


	public static void main(String[] args) {//runs the game once and asks the user if they want to play again
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] scores = new String[5]; // Array for storing scores 
		for(int i = 0; i < scores.length; i ++) { // Sets each element of the array to loss by default
			scores[i] = " Loss";
		}
		int wins = 0;
		int jackpots = 0;
		for(int i = 0; i < 5; i ++) {
			switch(playOneRound()) {
			case 1: scores[i] = " Win";
			wins ++;
			break;
			case 2: scores[i] = " Jackpot";
			jackpots ++;
			break;
			}
			boolean validChoice = false;
			do { 
				System.out.println("Play Again? (y/n)"); // prompts for user input and checks 
				String temp = in.next();
				if (temp.equals("n")) {
					break;
				}
				else if(temp.equals("y")){
					validChoice = true;
				}
			} while (!validChoice); 
		}
		System.out.println("Game over, Final scores:");
		printScores(scores);
		System.out.printf("%7s%1d%6s%1d%10s\n", "Total: ", wins, " Wins ", jackpots, " Jackpots ");
		System.out.println("Go home, gambling destorys families");
	}

	public static int numberGeneration() { //generates a random integer between 0 and 9
		return (int)(Math.random() * 10);
	}
	public static int playOneRound(){ //prints a slot machine and calculates result
		int a = numberGeneration(); //generate the random numbers
		int b = numberGeneration();
		int c = numberGeneration();
		printBars(); //prints the slot machine
		System.out.println("| " + a + " | " + b + " | " + c + " |");
		printBars();
		if( a == b || a == c || b == c) {
			if ( a == b && b ==c) {
				System.out.println("Three of a kind, Jackpot!");
				return 2;
			}
			else {
				System.out.println("Two of a kind, Winner!");
				return 1;
			}
		}
		else {
			return 0;
		}
	}
	public static void printBars() { // assists in printing the resulting slot machine
		System.out.println("+---+---+---+");
	}
	public static void printScores(String[] array) { // prints the final score sheet
		for(int i = 0; i < array.length; i ++) {
			System.out.println("Round " + (i + 1) + ":" + array[i]);
		}
	}
}
