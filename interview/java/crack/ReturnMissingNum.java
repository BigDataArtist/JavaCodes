package interview.java.crack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReturnMissingNum {

	public static int findNum(int[] num, int n) {
		int total = 0;
		/* sum of first n natural nums */
		total = (n + 1) * (n + 2) / 2; // As our size of the array will be one
										// more than present here(n=5) to (n=6)
		for (int i = 0; i < num.length; i++) {
			// System.out.println(total);
			total = total - num[i];
		}
		return total;
	}

	public static void main(String args[]) {
		int num = findNum(new int[] { 1, 3, 4, 5, 6 }, 5);
		System.out.println(num);
	}
}

class ReturnMOneMissingNum {

	public static int OneMissing(int[] num) {

		int totalXor = 0;
		int ArrXor = 0;
		for (int i = 1; i <= num.length + 1; i++) { // this is the original size
													// of the array where will
			System.out.println("totalXor before" + " " + totalXor); // we
																	// compare
																	// it from
																	// our
																	// missing
																	// number
																	// array
			totalXor = totalXor ^ i;

			System.out.println("totalXor after " + " " + totalXor + " " + "i is " + i);
		}

		for (int i : num) {
			ArrXor = ArrXor ^ i;
			System.out.println("ArrXor is " + ArrXor + " i is " + i);
		}
		return totalXor ^ ArrXor;

	}

	public static void main(String args[]) {
		int res = OneMissing(new int[] { 1, 3, 4, 5 });
		System.out.println(res);
	}

}

class findDulplicateString {
	public static void main(String args[]) {
		int count = 0;

		String[] str = new String[] { "java", "Adi", "getJob", "java", "Adi", "maria", "maria" };

		HashSet<String> NonDuplicate = new HashSet<String>();
		HashSet<String> Duplicate = new HashSet<String>();

		for (String elements : str) {
			if (!NonDuplicate.contains(elements)) { // non (!NonDuplicate) means
													// add element if its not
													// there already
				NonDuplicate.add(elements);
			} else {
				Duplicate.add(elements);
			}
		}

		Iterator<String> itr = Duplicate.iterator(); // Iterate over the hashSet
		Iterator<String> itrNon = NonDuplicate.iterator();

		while (itrNon.hasNext()) {
			System.out.println(" Non Duplicate String are  " + itrNon.next());
		}

		while (itr.hasNext()) {
			count++;
			System.out.println("duplicates are " + itr.next() + " " + count);
		}
	}
}

class findDupliCharacter{
	
	public static void main(String args[]){
		
		String s = "KaatiBawrer";
		int count = 0;
		 char c = '\u0000';
		
		HashSet<Character> orig = new HashSet<Character>();
		HashSet<Character> Dups = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for( int i = 0 ; i < s.length();i++){
		       c = s.charAt(i);
		        
		        if(!orig.contains(c)){
		        	orig.add(c);
		        	sb.append(c);
		        }
		        
		        else{
		        	Dups.add(c);
		        	
		        }
   
		}
		
		Iterator<Character> itr = orig.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next()+" "+ count++);
		}
		
		System.out.println(sb.toString());
	
		}

	}
	

class FindDuplicateCharacter {
	public static void main(String args[]) {

		String str = "KaatiBawree";

		System.out.println(removeDuplicates(str));

	}

	public static String removeDuplicates(String str) {
		Set<Character> word = new HashSet<>();
		Set<Character> dupli = new HashSet<>();
		StringBuffer stringbuffer = new StringBuffer(); // to print the
														// correcter together in
														// one sentence

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i); // This is for converting String into
											// characters
			if (!word.contains(c)) {
				word.add(c);
				stringbuffer.append(c);
			}

			else {
				dupli.add(c);
			}
		}

		Iterator<Character> iter = word.iterator();
		while (iter.hasNext()) {
			System.out.println("the non duplicate characters are " + iter.next());
		}

		Iterator<Character> dupl = dupli.iterator();
		while (dupl.hasNext()) {
			System.out.println("duplicate characters are " + dupl.next());
		}
		return stringbuffer.toString(); // because we cant return the
										// stringbuffer object

	}

}

class CatchDuplicateNos {
	public static void main(String args[]) {

		int[] nos = new int[] { 1, 2, 3, 3, 4, 5, 6, 7, 7 };

		Set<Integer> NonDuplie = new HashSet<Integer>();

		Set<Integer> DupliNos = new HashSet<Integer>();

		for (Integer no : nos) {
			if (!NonDuplie.contains(no)) {
				NonDuplie.add(no);
			}

			else {
				DupliNos.add(no);
			}
		}

		Iterator<Integer> iterate = NonDuplie.iterator();
		Iterator<Integer> Dupiterate = DupliNos.iterator();

		while (iterate.hasNext()) {
			System.out.println(" The Non Duplicate " + iterate.next());
		}

		while (Dupiterate.hasNext()) {
			System.out.println(" The Duplicate nos are " + Dupiterate.next());
		}

	}
}

class CalculateVowels {
	public static void main(String args[]) {

		int count = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String str = "ShamaSikander  hello";

		Set<Character> vowelsin = new HashSet<Character>();

		Set<Character> countVowels = new HashSet<Character>();
		Set<Character> NotcountVowels = new HashSet<Character>();

		for (Character wowels : vowels) {
			vowelsin.add(wowels);
		}

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);

			if (vowelsin.contains(c)) {

				countVowels.add(c);
			} else {
				NotcountVowels.add(c);
			}
		}
		Iterator<Character> itr = vowelsin.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

		Iterator<Character> cr = countVowels.iterator();
		while (cr.hasNext()) {
			count++;
			System.out.println("The vowels are " + cr.next());
		}
	}
}

class ReviseWovels{
	public static void main(String args[]){
		
		char[] vowels = {'a' ,'b','c','d','e'};
		
		String str  = "ShamaSikander  hello";
		
		
		HashSet<Character> StoreChar = new HashSet<Character>();
		
		HashSet<Character> vows   = new HashSet<Character>();
		HashSet<Character> ovals   = new HashSet<Character>();
		
		
		
		for( Character c : vowels){
				StoreChar.add(c);
			}
		
		
		for(int i = 0 ; i < str.length();i++){
			
			char c1 = str.charAt(i);
			
			if(StoreChar.contains(c1)){
				ovals.add(c1);
			}
		}
	
		/*String[] str1 = str.split(" ");
		
		for( int i = 0 ; i < str1.length;i++){
			System.out.print(str1[i]+" ");
		}
		*/
		
		Iterator<Character> itr = ovals.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
		
	}
}






























