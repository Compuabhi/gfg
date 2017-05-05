package com.array.gfg;

public class mergeSort {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 9, 5, 5, 12, 23, 1, 256, 123, 178 };
		for(int x:arr)
		System.out.print(x+" ");
		System.out.println();
		
		mergeSort(arr);
		
		for(int x:arr)
		System.out.print(x+" ");
		System.out.println();

	}

public static void mergeSort(int[] arr) {

		int n = arr.length;
		int i;
		if (n < 2)
			return;
		int mid = (n - 1 - 0) / 2;
		int[] left = new int[mid + 1];
		int[] right = new int[n - mid - 1];

		for (i = 0; i <= mid; i++) {

			left[i] = arr[i];

		}

		for (i = mid + 1; i <= n - 1; i++) {

			right[i - mid - 1] = arr[i];

		}

		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);

	}

	public static void merge(int[] left, int[] right, int[] arr) {

		int i = 0, j = 0, k = 0;
		int n = left.length + right.length;
		
		while (k < n) {
		if (i < left.length && j < right.length) {
				if (left[i] <= right[j]) {
					arr[k] = left[i];
					i++;
					k++;
				} else if (right[j] < left[i]) {
					arr[k] = right[j];
					j++;
					k++;
				}
			} 
			else if (i == left.length) {
				arr[k] = right[j];
				k++;
				j++;
			} 
			else {
				arr[k] = left[i];
				i++;
				k++;

			}

		}

	}

}
