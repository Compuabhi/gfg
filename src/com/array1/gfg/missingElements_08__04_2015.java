package com.array1.gfg;

public class missingElements_08__04_2015 {

	private static boolean[] status = new boolean[100];

	public static void main(String[] args) {

		int[] arr = {9, 6, 900, 850, 5, 90, 100, 99};
		fun(arr);
		for(int i=0;i<100;i++)
			if(!status[i])
				System.out.print(" "+i);
	}

	static void fun(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=99)
				status[arr[i]]=true;
		}

	}

}
