package com.array.gfg;

public class min_coins_13_08_2015 {

	public static void main(String[] args) {

		int[] coins = { 25,5,10 };
		int value = 40, num;
		num = fun(coins, value);
		System.out.println("min no. is"+num);

	}

	public static int fun(int[] coins, int value) {
		int result = Integer.MAX_VALUE, temp;
		if (value == 0)
			{
			return 0;
			}
		else {
			for (int i = 0; i < coins.length; i++) {
				if (coins[i] <= value) {
					temp = fun(coins, value - coins[i]);
					if (result > (temp + 1))
						result = temp + 1;
				}
			}

		}
		return result;

	}
}

	

