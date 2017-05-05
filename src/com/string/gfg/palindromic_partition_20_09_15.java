package com.string.gfg;

public class palindromic_partition_20_09_15 {

	private static boolean[][] status;
	private static String str1;

	public static void main(String[] args) {

		String str = "aahaa";
		str1 = "";
		status = new boolean[str.length()][str.length()];
		fun(str);
	}

	static void fun(String str) {

		char[] strarr = str.toCharArray();
		int size = str.length();
		int i;
		for (i = 0; i < size; i++) {
			status[i][i] = true;
		}
		int l;
		for (l = 2; l <= size; l++) {
			for (i = 0; i <= size - l; i++) {
				if (l == 2)
					status[i][i + 1] = (strarr[i] == strarr[i + l - 1]);
				else
					status[i][i + l - 1] = ((strarr[i] == strarr[i + l - 1]) && status[i + 1][i + l - 2]);
			}

		}
		fun1(status, 0, 0, str);

	}

	static void fun1(boolean[][] status, int row, int coln, String str) {
		int n = status.length;
		int flag = 0;
		String strprev = str1;

		if (coln == n - 1 && status[row][coln]) {
			str1 = str1 + " " + str.substring(row, coln + 1);
			System.out.println(str1 + " " + str.substring(row, coln));
			return;
		}

		if (coln >= n - 1)
			return;

		for (int i = coln; i <= n - 1; i++) {
			if (flag == 1)
				str1 = strprev;
			if (status[row][i]) {
				str1 = str1 + " " + str.substring(row, i + 1);
				if (i == n - 1)
					System.out.println(str1);
				fun1(status, i + 1, i + 1, str);
				flag = 1;
			}
		}
	}

}
