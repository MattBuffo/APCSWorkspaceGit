import java.util.ArrayList;

public class Library {
	private static ArrayList<Book> Books;
	public static void main(String[] args) {
		Books = new ArrayList<Book>();
		Book Dune = new Epic("Dune", 1000,50,3);
		Book Websters = new Dictionary("Websters", 1000,10000);
		Books.add(Dune);
		Books.add(Websters);
		for(Book b: Books) {
			System.out.println(b);
		}
		Comparable LOTR = new Epic("LOTR",2000,100,3);
		System.out.println(LOTR.compareTo(Dune));
	}
}
