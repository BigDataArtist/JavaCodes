package interview.java.crack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class CountReplicationChar {

	public static void main(String args[]) {
		String[] anagram = new String[] { "aabbcc", "ab", "bbaa", "aabccd", "abcdd" };

		String[] anagram2 = new String[anagram.length];

		int count = 0;
		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < anagram.length; i++) {

			anagram2[i] = DistinctChar(anagram[i]);

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

		for (String words : hm.keySet()) {

			System.out.println(words + ":" + hm.get(words));
		}

	}

	private static String DistinctChar(String str) {

		StringBuilder sb = new StringBuilder();

		HashSet<Character> set = new HashSet<Character>(str.length());

		char[] chrs = new char[str.length()];

		chrs = str.toCharArray();

		for (char c : chrs) {
			set.add(c); // this will avoid duplicates for similar types of
						// anagram to count the real value
		}

		for (char c : set) {
			sb.append(c);

		}

		return sb.toString();
	}

}
