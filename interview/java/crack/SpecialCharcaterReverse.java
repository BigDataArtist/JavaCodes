package interview.java.crack;

public class SpecialCharcaterReverse {

	public static void main(String args[]) {

		String str = "hello $#@";
		String st = null;
		char ch = '\u0000';
		
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			System.out.println(" Str1 is " + str1[i] + " " + i);

			if (i == 0)
				st = str1[0];
		}

		int len = st.length();
		
		System.out.println(" final output is ");

		for (int i = 0; i < len; i++) {

			ch = st.charAt(len - i - 1);

			System.out.print(ch + " ");
			
		}
		System.out.println(str1[1]);
		
		System.out.println();

		/*for (int i = 0; i < str1.length; i++) {
			System.out.println(" whole string is  " + str1[i]);*/
		}

	
}
