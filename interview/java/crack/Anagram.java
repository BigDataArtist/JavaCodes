package interview.java.crack;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class GFG {

	/*
	 * function to check whether two strings are anagram of each other
	 */
	static boolean areAnagram(char[] str1, char[] str2) {
		// Get lenghts of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		quickSort(str1, 0, n1 - 1);
		quickSort(str2, 0, n2 - 1);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	// Following functions (exchange and partition
	// are needed for quickSort)
	static void exchange(char A[], int a, int b) {
		char temp;
		temp = A[a];
		System.out.println("temp is " + temp);
		A[a] = A[b];
		System.out.println("A[a] is " + A[a]);
		A[b] = temp;

		System.out.println("A[b] is " + A[b]);
	}

	static int partition(char A[], int si, int ei) {
		char x = A[ei];
		System.out.println("x is " + x);
		int i = (si - 1);
		System.out.println(" i is " + i);
		int j;

		System.out.println(" si is " + si + " ei is " + ei);
		for (j = si; j <= ei - 1; j++) {
			System.out.println("A[j] is " + A[j]);
			if (A[j] <= x) {
				i++;
				exchange(A, i, j);
			}
		}
		exchange(A, i + 1, ei);
		return (i + 1);
	}

	/*
	 * Implementation of Quick Sort A[] --> Array to be sorted si --> Starting
	 * index ei --> Ending index
	 */
	static void quickSort(char A[], int si, int ei) {
		int pi; /* Partitioning index */
		if (si < ei) {
			pi = partition(A, si, ei);
			quickSort(A, si, pi - 1);
			quickSort(A, pi + 1, ei);
		}
	}

	/* Driver program to test to print printDups */
	public static void main(String args[]) {
		char str1[] = { 't', 'e', 's', 't' };
		char str2[] = { 't', 't', 'e', 'w' };
		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
}

public class Anagram {

	public static void main(String args[]) {

		String ana = "Aditya";

		String str = ana.toLowerCase();

		String nan = "tidaya";

		int counting = 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		HashMap<Character, Integer> du = new HashMap<Character, Integer>();

		for (Character ch : nan.toCharArray()) {

			if (du.containsKey(ch)) {
				int count = du.get(ch) + 1;
				System.out.println(" char is " + ch + " " + count);
			}

			du.put(ch, 1);
		}

		for (int i = 0; i < ana.length(); i++) {

			char c = str.charAt(i);

			if (hm.containsKey(c)) {
				int count = hm.get(c) + 1;

				System.out.println(" the character is " + c + " and the count is " + count);
			} else {
				hm.put(c, 1);
			}
		}

	}

}

class Words {

	public static void character(String str, char c) {
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			System.out.println(c + " " + countOccur(str, c));
		}
	}

	public static int countOccur(String str, char c) {

		int count = 0;
		while (str.indexOf(c) != -1) {
			count++;

			str = str.substring(str.indexOf(c) + 1);
		}
		return count;
	}

	public static void main(String args[]) {

		String stir = "aditya";
		String str = "tidaya";

		char c = '\u0000';

		character(stir, c);

	}
}

class GFG1 {

	static int NO_OF_CHARS = 256;

	/*
	 * function to check whether two strings are anagram of each other
	 */
	static boolean areAnagram(char str1[], char str2[]) {
		// Create 2 count arrays and initialize
		// all values as 0
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);
		int i;

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (i = 0; i < str1.length && i < str2.length; i++) {

			count1[str1[i]]++;

			System.out.println(str2[i]);
			count2[str2[i]]++;
		}

		// If both strings are of different length.
		// Removing this condition will make the program
		// fail for strings like "aaca" and "aca"
		if (str1.length != str2.length)
			return false;

		// Compare count arrays
		for (i = 0; i < NO_OF_CHARS; i++)
			if (count1[i] != count2[i])
				return false;

		return true;
	}

	/* Driver program to test to print printDups */
	public static void main(String args[]) {
		char str1[] = ("geeksforgeeks").toCharArray();
		char str2[] = ("forgeeksgeeks").toCharArray();

		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + "anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
}

class anas {

	public static boolean anaGram(char[] str, char[] str1) {

		int no_of_char = 256; // no of characters in 8 bit size

		int[] count1 = new int[no_of_char];

		Arrays.fill(count1, 0);

		int[] count2 = new int[no_of_char];

		Arrays.fill(count2, 0);

		for (int i = 0; i < str.length && i < str1.length; i++) {

			// this will count the occurrence of each character in the charArray
			// and will increment more than one for each repeating character
			count1[str[i]]++;
			count2[str1[i]]++;
		}

		// If both strings are of different length.
	    // Removing this condition will make the program
		// fail for strings like "aaca" and "aca"
		if (str.length != str1.length)
			return false;

		for (int i = 0; i < no_of_char; i++) {

			// this is counting the occurence of that character in total 256
			// chars and macthing it with the others
			if (count1[i] != count2[i])
				return false;

		}

		return true;
	}

	public static void main(String args[]) {

		char[] str = "geeksforgeeks".toCharArray();

		char[] str1 = "forgeeksgeeks".toCharArray();

		if (anaGram(str, str1)) {
			System.out.println("these two strings are anagram");
		}

		else {
			System.out.println("these two strings are not anagram");
		}

	}
}
