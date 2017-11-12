
public class Dictionary extends Book{
	private int definitions;
	public Dictionary(int numPages, int numDefinitions) {
		super(numPages);
		definitions = numDefinitions;
	}
	public String toString() {
		return super.toString() + " " + definitions + " definitions"; 
	}
}
