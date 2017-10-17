import java.util.Scanner;
public class PIGgame {
	die die1 = new die();
	die die2 = new die();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Do you want to play a game? (y/n)"); //ask player if they actually want to play
		String responce = in.next();
		while(!(responce.equals("y")) && !(responce.equals("n"))) {
		System.out.println("Sorry, I diddn't get that, please type 'y' or 'n'");
			responce = in.next();
			
		}
		if(responce.equals("n")) System.out.println("Ok then, bye!");
		else {
			System.out.println("How many human players (enter an integer amount)");
			int humans = in.nextInt();
			System.out.println("How many computer players (enter an integer amount)");
			int computers = in.nextInt();
			player[] players = new player[computers + humans];
			for(int i = 0; i < players.length; i++) {
				if(i < humans) {
					players[i] = new player(false);
				}
				else players[i] = new player(true);
			}
			
			System.out.println("Ok, Bye!");
		}

	}
	private static int winner(player[] players) {
		for(int i = 0; i < players.length; i ++) {
			if(players[i].getPlayerScore() > 100) {
				return i;
			}

		}
		return -1;
	}
	private static int playGame(player[] players, Scanner in) {
		while(winner(players) < 0) {
			for(player currentPlayer: players) {
				boolean passTurn = false;
				System.out.println("Pass the turn? (y/n)");
				String responce = "";
				while(!(responce.equals("y")) && !(responce.equals("n"))) {
					System.out.println("Sorry, I diddn't get that, please type 'y' or 'n'");
						responce = in.next();
						
					}
				
			}
		}
		return winner(players);
	}
	private static boolean yesNo(Scanner in) {
		String responce = in.next();
		while(!(responce.equals("y")) && !(responce.equals("n"))) {
			System.out.println("Sorry, I diddn't get that, please type 'y' or 'n'");
				responce = in.next();
				
			}
		if (responce.equals("y")) return true;
		else return false;
	}
}
