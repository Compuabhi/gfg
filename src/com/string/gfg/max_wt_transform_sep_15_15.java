package com.string.gfg;

import java.util.Arrays;

public class max_wt_transform_sep_15_15 {

	private static int[] dp;

	public static void main(String[] args) {

		String str = "AAAAABB";
		int n = str.length();
		dp = new int[n];
		Arrays.fill(dp, -1);
		int ans = fun(str, 0, n);
		System.out.println("final answer is: " + ans);

	}

	static int fun(String str, int i, int n) {

		if (i >= n)
			return 0;

		if (dp[i] != -1)
			return dp[i];

		if (i == n - 1)
			return dp[n - 1] = 1;
		int ans = 0;
		if (i + 1 < n) {
			if (str.charAt(i) != str.charAt(i + 1))
				ans = Math.max(4 + fun(str, i + 2, n), 1 + fun(str, i + 1, n));
			else
				ans = Math.max(3 + fun(str, i + 2, n), 1 + fun(str, i + 1, n));

		}

		return dp[i] = ans;
	}

}
