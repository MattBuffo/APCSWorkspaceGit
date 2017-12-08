
public class testClass {
	public static void main(String[] args) {
		Book myBook = new Epic("name", 100,1000, 10);
		
		System.out.println(((Epic)myBook).getBooks());
	}
}
