package interview.java.crack;

public class IntegerIsPalindrome {

	public static boolean numPalindrome(int x) {

		String ParseNum = Integer.toString(x);

		int lenPar = ParseNum.length();
		for (int i = 0; i < ParseNum.length() / 2; i++) {
			if (ParseNum.charAt(i) != ParseNum.charAt(lenPar - 1 - i)) {
				return false;
			}
		}
		return true; // this is the return for boolean line 2 in case we were
						// wondering why is this out of loop

	}

	public static void main(String args[]) {
		boolean result = numPalindrome(3232323);
		System.out.println(result);
	}
}

class IntIspal {

	
public static boolean palindrome(String num){
		
		
		
		char c = '\u0000';
	

		String convert = num.toString();
	//	String convert = Integer.toString(num);  --> This is for converting integer to string
		

		System.out.println(" x is " + num);

		for (int i = 0; i < convert.length(); i++) {
			if (convert.charAt(i) != convert.charAt(convert.length() - i - 1)){

			return false;
			}
		}
			return true;
			
		
}

		public static void main(String args[]) {
		
		boolean b = palindrome("NITINll");
		
		if( b == true){
		System.out.println(" so it is a palindrome");
	}
		
		else{
			System.out.println(" it is not a palindrome");
		}
}
}