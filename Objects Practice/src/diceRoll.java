
public class diceRoll {
	public static void main(String[] args) {
		die die1 = new die();
		die die2 = new die();
		int timesToDubs = 0;
		while(die1.roll() != die2.roll()) {
			timesToDubs ++;
		}
		System.out.println(timesToDubs);
	}
}
