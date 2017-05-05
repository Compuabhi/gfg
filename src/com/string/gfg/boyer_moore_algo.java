package com.string.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boyer_moore_algo {

	static private int[] badchararr = new int[256];

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String text = new String(br.readLine());
//		String pattern = new String(br.readLine());

		String pattern = "TEXT";
		String text = "TEXTEXT ISTEXT AND IT IS TEXT";
		badchar_fun(pattern);
		search_pattern(pattern, text);

	}

	
	public static void search_pattern(String pattern, String text) {
		
		int n = text.length();
		int m = pattern.length();
		int j;
		int i = 0;
		while (i <= n - m) {
			j = m - 1;

//			check this ??giving error
			while (  (j >= 0) && (pattern.charAt(j) == text.charAt(i + j)))
				j--;

			if (j < 0) {
				System.out.println("pattern is matched at" + i + "th position");
// i+m=n case should be avoided ,as i+m<=n-1 so, for that single case shift by 1
				i += (i + m < n) ? m - badchararr[text.charAt(i + m)] : 1;

			}
			// s += (s+m < n)? m-badchar[txt[s+m]] : 1;
			// s += max(1, j - badchar[txt[s+j]]);
			//shift can be negative so to avoid those cases we are taking max of 1 with shift variable
			//so we try to prefer shift greater than if possible
			else {
				i += Math.max(1, j - badchararr[text.charAt(i + j)]);

			}

		}

	}

	static void badchar_fun(String pattern) {
		for (int i = 0; i < 256; i++) {
			badchararr[i] = -1;
		}
		for (int i = 0; i < pattern.length(); i++) {
			badchararr[pattern.charAt(i)] = i;
		}

	}
}
