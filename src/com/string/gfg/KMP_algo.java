package com.string.gfg;

public class KMP_algo {

	public static void main(String[] args) {

		String text = "abcdabc";
		String pattern = "abc";
		search(pattern.toCharArray(), text.toCharArray());

	}

	// searching the pattern in text in linear time O(n)...using the info.
	// that whether there is any prefix which is suffix in pattern
	// no backtracking in text
	// once character compared , it won't be compared again
	public static void search(char[] pattern, char[] text) {
		int[] preproc = preproc_fun(pattern);
		int j = 0;
		int i = 0;
		boolean counter = false;

		while (i < text.length) {

			if (j < pattern.length && pattern[j] == text[i]) {
				j++;
				i++;
				// for the ending cases....so that this if is executed in this
				// loop only
				if (j == pattern.length) {
					System.out.println("pattern found at" + (i - j)
							+ "th position");
					j = preproc[j - 1];
					counter = true;
				}
			}
//			} else if (j == pattern.length) {
//				System.out
//						.println("pattern found at" + (i - j) + "th position");
//				j = preproc[j - 1];
//				counter = true;
//			} 
				else {
				if (j != 0)
					j = preproc[j - 1];
				else
					i++;

			}

		}

		if (!counter)
			System.out.println("no pattern found");
	}

	public static int[] preproc_fun(char[] patt) {
		int[] preproc = new int[patt.length];

		preproc[0] = 0;
		int j = 0;
		int i = 1;

		while (i < patt.length) {
			if (patt[i] == patt[j]) {
				preproc[i] = j + 1;
				j++;
				i++;
			} else {
				if (j == 0) {
					preproc[i] = 0;
					i++;
				} else {
					j = preproc[j - 1];
				}

			}

		}

		return preproc;

	}

}
