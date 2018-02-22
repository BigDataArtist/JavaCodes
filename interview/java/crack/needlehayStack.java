package interview.java.crack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class needlehayStack {

	public static void main(String[] args) {

		String haystack ="hello";

		String needle = "ll";

		for (int i = 0; i < haystack.length(); i++) {

			System.out.println(" i is " + i);

			if (haystack.charAt(i) == needle.charAt(0)) {

				int flag = 0;
				int k = i;

				for (int j = 0; j < needle.length(); j++) {

					if (needle.charAt(j) != haystack.charAt(k++)) {
						flag = 1;
						break;
					}
				}

				if (flag == 0) {
					System.out.println(i);
					return;
				}

			}

		}
		System.out.println(-1);
		return;

	}

}