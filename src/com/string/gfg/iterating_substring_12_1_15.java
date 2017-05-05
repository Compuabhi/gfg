package com.string.gfg;

import java.io.*;
import java.util.*;

public class iterating_substring_12_1_15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=1;
		String str=new String();
		while(i!=0)
		{
			str=(br.readLine());
			i=Integer.parseInt(br.readLine());
			int n = str.length();
			int len = kmp_preprocess(str.toCharArray());
			if (n % (n - len) == 0 && len>0)
				System.out.println((n / (n - len)) + " iteration of substring :"
						+ str.substring(0, n - len) + " will result in string ");

			else
				System.out.println("not possible");
		
		
		}
		
	}

	public static int kmp_preprocess(char[] str) {
		int i = 0;
		int j = 1;
		int[] arr = new int[str.length];
		arr[0] = 0;

		while (j < str.length) {
			if (str[i] == str[j]) {
				arr[j] = i + 1;
				i++;
				j++;
			} else {
				if (i == 0) {
					arr[j] = 0;
					j++;
				} else
					i = arr[j - 1];

			}

		}

		return arr[str.length-1];
	}

}
