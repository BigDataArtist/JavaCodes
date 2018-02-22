package interview.java.crack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ElementAtIndexAfterRotation {

	public static int[] RotateAccording(int[] arrs, int index) {
		
		
		int temp = arrs[0];

		for (int i = 0; i <= index; i++) {


			if (arrs[i] == index) {

				arrs[0] = arrs[index];

				arrs[index] = arrs[index - 1];

				arrs[1] = arrs[0];
			}

		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i] + " ");
		}

		return arrs;
	}

	public static void main(String args[]) {

		int[] arrs = { 1,2, 3, 4, 5 };
		int index = 2;

		RotateAccording(arrs, index);

	}

}

class MySolution {

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return " ";
		}

		if (strs.length == 1) {
			return strs[0];
		}

		String prefix = strs[0];

		System.out.println(" prefix is " + prefix);
		int index = 0;

		while (index < prefix.length()) {
			System.out.println(" index is " + index);
			System.out.println(" prefix length is " + prefix.length());

			for (int i = 0; i < strs.length; i++) {

				System.out.println("index is " + index);
				System.out.println(" strs[i].length " + strs[i].length());
				if (index == strs[i].length()) {

					System.out.println(index);
					System.out.println("strs[i].length()" + strs[i].length());

					return prefix.substring(0, index);
				}

				System.out.println("prefix.charAt(index)" + prefix.charAt(index) + "  strs[i].charAt(index)"
						+ strs[i].charAt(index));
				if (prefix.charAt(index) != strs[i].charAt(index)) {
					return prefix.substring(0, index);
				}
			}
			index++;
		}

		return prefix.substring(0, index);

	}

	public static void main(String args[]) {

		MySolution s = new MySolution();
		String[] arrs = { "abcd", "abcme", "abcde", "abcdlm" };
		System.out.println(s.longestCommonPrefix(arrs));

	}

}

class CommonPrefix {

	public static String ComonPre(String[] arrs) {

		if (arrs == null || arrs.length == 0) {
			return " ";
		}

		if (arrs.length == 1) {
			return arrs[0];
		}

		int index = 0;

		String prefix = arrs[0]; // this will save the value which is to be
									// compared

		while (index < prefix.length()) {

			for (int i = 0; i < arrs.length; i++) {

				if (index == arrs[i].length()) { // if index == arrs length so
													// there is no use going
													// further because after
													// thsi if index will
													// increment then there will
													// be no value to compare at
													// that index so it will
													// return that substring
													// from zero
					return prefix.substring(0, index);
				}

				if (prefix.charAt(index) != arrs[i].charAt(index)) {
					return prefix.substring(0, index);
				}
			}

			index++;
		}

		return prefix.substring(0, index);
	}

	public static void main(String args[]) {
		String[] arrs = { "abc", "abcd", "abcde", "abcdlm" };

		System.out.println(ComonPre(arrs));
	}
}

class NewSolution {
	public static List<String> letterCombinations(String digits) {
		String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>();

		if (digits.length() == 0)
			return result;

		result.add("");

		System.out.println("digits.length " + digits.length());
		for (int i = 0; i < digits.length(); i++) {

			System.out.println("digitletter[digits.charAt(i)-'0'" + digitletter[digits.charAt(i) - '0']);
			result = combine(digitletter[digits.charAt(i) - '0'], result);
		}
		return result;
	}

	public static List<String> combine(String digit, List<String> l) {
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < digit.length(); i++)
			for (String x : l)
				result.add(x + digit.charAt(i));

		return result;
	}

	public static void main(String args[]) {

		System.out.println(letterCombinations("23"));

	}
}

