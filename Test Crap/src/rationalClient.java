
public class rationalClient {
	public static void main(String[] args) {
		Rational rat1 = new Rational(1,4);
		Rational rat2 = new Rational(1,4);
		System.out.println(Rational.add(rat1, rat2));
		System.out.println(rat1.add(rat2));
		System.out.println(rat1);
		rat2 = Rational.add(rat1, rat2);
		System.out.println(rat1.compareTo(rat2));
	}
}
