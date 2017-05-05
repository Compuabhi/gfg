package com.string.gfg;

public class longest_common_subseq {

	public static void main(String[] args) {
		char[] str1 = "ABCDGH".toCharArray();
		char[] str2 = "AEDFHR".toCharArray();
		fun(str1, str2);

	}

	static void fun(char[] str1, char[] str2) {

		int m = str1.length;
		int n = str2.length;

		int[][] dp = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				
				if (i == 0 || j == 0)
					dp[i][j] = 0;

				else if (str1[i - 1] == str2[j - 1])
					dp[i][j] = 1 + dp[i - 1][j - 1];
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

			}

		}

		System.out.println("largest value of common subsequence is" + dp[m][n]);

	}

}
