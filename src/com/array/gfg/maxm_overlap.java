package com.array.gfg;

import java.util.Arrays;
import java.util.Comparator;

public class maxm_overlap {

	private static node[] arr_node;

	static class node {
		Integer x;
		boolean arrival;

		node(int x, boolean arrival) {
			this.x = x;
			this.arrival = arrival;
		}

		String toString(node x) {
			String y = (x.x + String.valueOf(x.arrival));
			return y;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 10, 5, 5 };
		int[] exit = { 4, 5, 12, 9, 12 };
		int[] com_arr = { 1, 2, 10, 5, 5, 4, 5, 12, 9, 12 };
		arr_node = new node[com_arr.length];

		for (int i = 0; i < com_arr.length; i++) {
			if (i < arr.length)
				arr_node[i] = new node((com_arr[i]), true);
			else
				arr_node[i] = new node((com_arr[i]), false);
		}

		for (int k = 0; k < arr_node.length; k++)
			System.out.print("   " + arr_node[k].toString(arr_node[k]));
//sorting an array of objects
		Arrays.sort(arr_node, new Comparator<node>() {
			@Override
			public int compare(node o1, node o2) {
				return o1.x.compareTo(o2.x);
			}
		});

		System.out.println();
		int max = 0;
		int max_time = 0;
		int count = 0;
		for (int k = 0; k < arr_node.length; k++) {
			System.out.print("   " + arr_node[k].toString(arr_node[k]));
			if (arr_node[k].arrival)
				count++;
			else
				count--;
			if (max < count) {
				max = count;
				max_time = arr_node[k].x;
			}

		}
		System.out.println();
		System.out.println("there are at max  " + max + " people " + "at time " + max_time);

	}

}
