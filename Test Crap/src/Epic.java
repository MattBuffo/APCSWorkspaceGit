
public class Epic extends Novel {
	int numBooks;
	public Epic(int pages, int chapters, int books) {
		super(pages,chapters);
		numBooks = books;
	}
	public int getBooks(){
		return numBooks;
	}
	public String toString() {
		return (numBooks + " Books, " + super.toString()); 
	}
	public boolean equals(Epic e) {
		if(numBooks == e.getBooks() && this.getChapters() == e.getChapters() && this.getPages() == e.getPages()) return true;
		else return false;
	}
}
