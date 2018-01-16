import java.util.ArrayList;

public class Problem {
	public static void main(String[] args) {
		int numberCount = 0;
		
		for(int i = 100; i <= 999; i++) {
			if(isPalindrome(i + reverseNum(i)) && (endsInZero(i) == false)) {
				numberCount ++;
				}
		}
		System.out.println(numberCount);
		
	}
	public static boolean isPalindrome(int resultNumber) {
		String temp = "" + resultNumber;
		for(int i = 0; i < temp.length(); i ++) {
			if(	 
					(temp.charAt(i) != temp.charAt(temp.length() - (i+1))))
				//endsInZero(i)) 
				{
				return false;
			}
		}
		return true;
	}
	public static int reverseNum(int number) {
		String temp1 = "" + number;
		String temp2 = "";
		for(int i = temp1.length() - 1; i >= 0; i --) {
			temp2 += temp1.charAt(i);
		}
		return Integer.parseInt(temp2);
	}
	public static boolean endsInZero(int num) {
		String temp = "" + num;
		if(temp.charAt(temp.length() - 1) == '0'){
			
			
			return true;
		}
		
		else { 
		
			return false;}
	}
}
