package com.array.gfg;

public class zig_zag_22_08_15 {

	public static void main(String[] args) {

		int[] arr ={4, 3, 7, 8, 6, 2, 1};
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();
		fun(arr);
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println();

	}

	public static void fun(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0){
				if (arr[i] > arr[i - 1]) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
			
			else {
					if (arr[i] < arr[i - 1]) {
						temp = arr[i];
						arr[i] = arr[i - 1];
						arr[i - 1] = temp;
					}

				}

		}

	}

}
