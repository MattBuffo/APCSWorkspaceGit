
public class Name implements Comparable<Name>{ //part a
	private String first;
	private String last;
	public Name(String firstName, String lastName) {
		first = firstName;
		last = lastName;
	}
	public String getFirst() { //needed for part b & c
		return first;
	}
	public String getLast() { //needed for part b & c
		return last;
	}
	public int compareTo(Name n) { //part b
		int returnInt = 0;
		if(n.getLast().equals(last)) {
			if(n.getFirst().equals(first)) {
				returnInt = 0;
			}
			else {
				returnInt = (n.getFirst().compareTo(first));
			}
		}
		else {
			returnInt = (n.getLast().compareTo(last));
		}
		return returnInt;
	}
	public String toString() { //part c
		return (first + " " + last);
	}
}
