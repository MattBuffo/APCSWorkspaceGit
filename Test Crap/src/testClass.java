
public class testClass {
	public static void main(String[] args) {
		Book myBook = new Epic("name", 100,1000, 10);
		int temp = 0;
		for(int row = 7; row < 17; row++) {
			for(int col = 6; col < 15; col++) {
				temp ++;
			}
		}
		System.out.println(temp);
	}
}
