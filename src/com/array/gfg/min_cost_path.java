package com.array.gfg;
/*
public class min_cost_path {

	public static void main(String[] args) {

		int[][] cost = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

	System.out.println("the min cost value is:-" +mincostfun(cost, 2, 2));

	}

	public static int mincostfun(int cost[][], int m, int n) {

		if (m == 0 && n == 0)
			return cost[0][0];
		else if (m < 0 || n < 0)
			return Integer.MAX_VALUE;
		else
			return cost[m][n]
					+ min(mincostfun(cost, m - 1, n), mincostfun(cost, m - 1, n - 1), mincostfun(cost, m, n - 1));


	}

	public static int min(int x, int y, int z) {
		int min = (x >= y) ? y : x;
		min = (min >= z) ? z : min;
		return min;
	}

}
*/

//dynamic programming approach

public class min_cost_path {

	public static void main(String[] args) {

		int[][] cost = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

		System.out.println("the min cost value is:-" + mincostfun(cost, 2, 2));

	}

	public static int mincostfun(int[][] cost, int m, int n) {

		int dp[][] = new int[m + 1][n + 1];
		dp[0][0] = cost[0][0];
		int i, j;

		for (i = 1; i <=n; i++) {
			dp[0][i] = dp[0][i - 1] + cost[0][i];
		}
		for (i = 1; i <=m; i++) {
			dp[i][0] = dp[i - 1][0] + cost[i][0];
		}

		for (i = 1; i <=m; i++) {
			for (j = 1; j <= n; j++) {
				dp[i][j] = cost[i][j] + min(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[m][n];
	}

	public static int min(int x, int y, int z) {
		int min = (x >= y) ? y : x;
		min = (min >= z) ? z : min;
		return min;
	}

}
