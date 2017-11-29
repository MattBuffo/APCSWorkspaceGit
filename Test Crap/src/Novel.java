
public class Novel extends Book implements Comparable<Novel> {

	private int chapters;
	public Novel(String name, int pages, int numOfChapters) {
		super(name, pages);
		chapters = numOfChapters;
	}
	public int getChapters() {
		return chapters;
	}
	public String toString() {
		return chapters +" Chapters " + super.getPages() + " Pages ";
	}
	public boolean equals(Novel n) {
		if(this.toString().equals(n.toString())) return true;
		else return false;
	}
	public int compareTo(Novel n) {
		return (this.toString().compareTo(n.toString()));
	}
	
}
