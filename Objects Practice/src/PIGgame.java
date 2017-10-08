import java.util.Scanner;
public class PIGgame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		die die1 = new die();
		
		System.out.println("Do you want to play a game? (y/n)"); //ask player if they actually want to play
		String responce = in.next();
		while(!(responce.equals("y")) && !(responce.equals("n"))) {
		System.out.println("Sorry, I diddn't get that, please type 'y' or 'n'");
			responce = in.next();
			
		}
		if(responce.equals("n")) System.out.println("Ok then, bye!");
		else {
			
			System.out.println("Ok, Bye!");
		}

	}
}
