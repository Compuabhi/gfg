package com.string.gfg;
//Dynamic Programming | Set 17 (Palindrome Partitioning) geeksforgeeks
import java.util.Scanner;

public class pal_partion {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		String str ="ababbbabbababa";
		minPalPartition(str);

	}

	static void minPalPartition(String str) {
		int n = str.length();

		boolean[][] P = new boolean[n][n];
		int[][] count = new int[n][n];

		for (int i = 0; i < n; i++) {
			P[i][i] = true;
			count[i][i] = 0;
		}
		for (int l = 2; l <= n; l++)

		{
			for (int i = 0; i <= n - l; i++) {
				int j = l + i - 1;

				if (l == 2)  
					P[i][j] = (str.charAt(i) == str.charAt(j));

				else  
					P[i][j] =  (str.charAt(i) == str.charAt(j) && P[i + 1][j - 1]);
			
				if(P[i][j]==true)
						count[i][j]=0;
				
				else {	count[i][j]=Integer.MAX_VALUE;
					for (int k = i; k <= j - 1; k++) {
						count[i][j] = min(count[i][j], count[i][k]
								+ count[k + 1][j] + 1);
					}

				}

			}
		}
		System.out.println("minm no. of partitions required to break it: "+count[0][n-1]);

	}

	public static int min(int n1, int n2) {
		return (n1>n2)?n2:n1;
	}

}
