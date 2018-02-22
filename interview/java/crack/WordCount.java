package interview.java.crack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
	static int i = 0;

	public static void freqCount(String str) {
		String str1 = str.replace(" ", ""); // this replaces space with no space

		while (str1.length() > i) {

			char ch = str1.charAt(i);
			i++;

			System.out.println(ch + " " + countChar(str1, ch));
		}

	}

	static int countChar(String str1, char ch) {

		int count = 0;
		System.out.println(" char is " + ch);

		while (str1.indexOf(ch) != -1) {

			count++;

			str1 = str1.substring((str1.indexOf(ch) + 1));
		}

		return count;
	}

	public static void main(String args[]) {

		String s = "programming";
		freqCount(s);
	}

}

class WordHashMap {

	public static void freqCount(String str) {

		String st = str.replace(" ", "");

		Map<Character, Integer> frequencyCount = new HashMap<Character, Integer>();

		for (char ch : st.toCharArray()) {

			if (frequencyCount.containsKey(ch)) {

				int count = frequencyCount.get(ch) + 1;

				frequencyCount.put(ch, count); // ch was already one from line
												// 58 and added one more
			} else {
				frequencyCount.put(ch, 1);
			}
		}

		System.out.println(frequencyCount);
	}

	public static void main(String args[]) {

		String s = "aaaabbbccd";
		freqCount(s);
	}
}
