import java.util.Scanner;
public class diceGameToNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Do you want to play a game? (y/n)");
		String responce = in.next();
		while(!(responce.equals("y")) && !(responce.equals("n"))) {
			System.out.println("Sorry, I diddn't get that, please type 'y' or 'n'");
			responce = in.next();
		}
		if(responce.equals("n")) System.out.println("Ok then, bye!");
		else {
			System.out.println("Here's how it workd: I roll two dice, if they add up to a number you choose you win!");
			System.out.println("What number do you want to play with?");
			int target = in.nextInt();
			System.out.println("How many sides do you want on your dice? (Integer greater than zero)");
			int sides = in.nextInt();
			while (sides < 0) {
				System.out.println("Please enter an integer greater than zero");
				sides = in.nextInt();
			}
			die die1 = new die(sides);
			die die2 = new die(sides);
			String keepPlaying = "y";
			int round = 1;
			while(keepPlaying.equals("y")) {
				System.out.println("Round " + round + ":");
				System.out.println("Die 1: " + die1.roll() + " Die 2:" + die2.roll());
				if((die1.currentFace() + die2.currentFace()) == target) {
					System.out.println("You win!\n");
					System.out.println("Play Again? (y/n)");
					keepPlaying = in.next();
					round ++;
				}
				else {
					System.out.println("Not this time");
					System.out.println("Play Again? (y/n)");
					keepPlaying = in.next();
					round ++;
				}
			}
			System.out.println("Ok, Bye!");
		}
	}
}
