package com.array1.gfg;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class union_intersect_Array_1MAY2015 {

	public static void main(String[] args) {

		int[] arr1 = {7, 1, 5, 8, 23, 16};
		int[] arr2 = {3, 8, 6, 20, 1};
		fun1(arr1, arr2);

	}

	static void fun(int[] arr1, int[] arr2) {
		int[] arr1Sorted = arr1;
		int[] arr2Sorted = arr2;

		Arrays.sort(arr1Sorted);
		Arrays.sort(arr2Sorted);
		int m = arr1Sorted.length;
		int n = arr2Sorted.length;
		ArrayList<Integer> union = new ArrayList<Integer>();
		ArrayList<Integer> intersect = new ArrayList<Integer>();
		int i = 0, j = 0;

		while (i < m && j < n) {

			if (arr1Sorted[i] < arr2Sorted[j]) {
				union.add(arr1Sorted[i]);
				i++;
			} else if (arr1Sorted[i] > arr2Sorted[j]) {
				union.add(arr2Sorted[j]);
				j++;
			} else {
				intersect.add(arr1Sorted[i]);
				union.add(arr1Sorted[i]);
				i++;
				j++;
			}

		}
		if (i == m) {
			while (j < n) {
				union.add(arr2Sorted[j]);
				j++;
			}

		} else {
			union.add(arr1Sorted[i]);
			i++;
		}
		for (Object x : union.toArray())
			System.out.print(x+" ");
		System.out.println();

		for (Object x : intersect.toArray())
			System.out.print(x+" ");
		System.out.println();
	}
	public static void fun1(int[]arr1,int []arr2){
		
		
	}

}
