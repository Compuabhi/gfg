package com.string.gfg;

import java.util.HashSet;
import java.util.Set;

public class distinct_palindrome_12_2_15 {

	public static void main(String[] args) {
		String str = "abaaa";
		check_pali(str.toCharArray());

	}

	public static void check_pali(char[] str) {
		HashSet<String> set = new HashSet<String>();//hashset for fast retrieval, no order followed
		int n = str.length;
		boolean[][] check = new boolean[n][n];

		int i , j;
		int len = 1;
		while (len <= n) {
			i=0;
			while (i <= n - len) {
			
				j = i + len - 1;
				if (i == j) {
					check[i][i] = true;
					set.add(String.valueOf(str).substring(i, j+1));
					System.out.println(String.valueOf(str).substring(i, j+1));
					i++;
				} else {
					if(len>2) {

						if (str[i] == str[j] && check[i + 1][j - 1])
						{check[i][j] = true;
						set.add(String.valueOf(str).substring(i, j+1));
						System.out.println(String.valueOf(str).substring(i, j+1));
						i++;
						}
						else
						{check[i][j] = false;
						i++;
						}
					}
					else
					{
						if (str[i] == str[j])//as i+1>j-1 so other condition is avoided
						{check[i][j] = true;
						set.add(String.valueOf(str).substring(i, j+1));
						System.out.println(String.valueOf(str).substring(i, j+1));
						i++;
						}
						else
						{	check[i][j] = false;
							i++;
						}
						
						
						
					}
				}
			}
			len++;
		}
		
		System.out.println("below we have "+set.size()+" palindromic substrings");
		if(!set.isEmpty()){
			for(Object str1:set.toArray())
				System.out.println(str1);;
		}
			

	}

}
