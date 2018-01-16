
public class POW {
	public static void main(String[] args) {
		final int day = 10;
		int temp = 0;
		for(int i = 0; i <= day; i ++) { // adds the presents per day together to get the total amount of presents
			temp += twelveDayify(i);
		}
		System.out.println(temp);
	}
	public static int twelveDayify(int day) { //applies the 12 days of Christmas formula to find presents per day
		int temp = 0;
		for(int i = 0; i <= day; i ++) { //adds the amount of presents together for that day
			temp += i;
		}
		return temp;
	}
}
