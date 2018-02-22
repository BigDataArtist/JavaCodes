package interview.java.crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnagramsCheck {

	static boolean CheckAna(char[] str, char[] str1) {

		int no_of_char = 256; // no of characters in 8bit
		int[] chCount = new int[no_of_char];

		Arrays.fill(chCount, 0);

		int[] ch1Count = new int[no_of_char];

		Arrays.fill(ch1Count, 0);

		for (int i = 0; i < str.length && i < str1.length; i++) {

			ch1Count[str[i]]++; // this is counting how many times that
								// character is coming and saving it in one of
								// placed in 256 char

			chCount[str1[i]]++;

		}

		if (str.length != str1.length) {
			return false;
		}

		for (int i = 0; i < no_of_char; i++) {

			System.out.println("ch1Count[i]" + ch1Count[i]);
			System.out.println("chCount[i]" + chCount[i]);
			// These will check of the same place within 256 characters has how
			// many counts like if "g" is saved at 10th position then it should
			// have 2 g in both the charArray saved at that place for it to be
			// anagram.
			if (ch1Count[i] != chCount[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {

		char[] str = "geeksforgeeks".toCharArray();

		char[] str1 = "freeksgogeeks".toCharArray();

		boolean val = CheckAna(str, str1);

		if (val == true) {
			System.out.println(" You know man its ana");
		} else {
			System.out.println(" its not ana at all");
		}

	}
}



class anagramRepition {

	public static void main(String args[]) {

		String[] anagrams = new String[] { "aabbcc", "ab", "bbaa", "aabccd", "abcdd" };

		String[] anagram2 = new String[anagrams.length];

		int count = 0;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < anagrams.length; i++) {

			// so here anagram2[i] will contain first String "aabbcc" which will
			// come back from sb.toString() "abc"
			anagram2[i] = DistinctChar(anagrams[i]);

		}

		for (int i = 0; i < anagram2.length; i++) {
			if (hm.isEmpty() || !hm.containsKey(anagram2[i])) {
				hm.put(anagram2[i], 1);
			} else {
				if (hm.containsKey(anagram2[i])) {
					count = hm.get(anagram2[i]) + 1;
					hm.put(anagram2[i], count);
				}
			}
		}
		for (String word : hm.keySet()) {
			System.out.println(word + ":" + hm.get(word));
		}

	}

	private static String DistinctChar(String str) {

		StringBuilder sb = new StringBuilder();

		HashSet<Character> set = new HashSet<Character>(str.length());

		char[] chr = new char[str.length()]; // everytime a new String comes to
												// allocates the length
												// accordingly

		chr = str.toCharArray();

		for (char c : chr) {
			set.add(c); // avoid duplicates and adds only one time
		}
		for (char c : set) {
			sb.append(c);

		}
		return sb.toString(); // This returns the String
	}
}
