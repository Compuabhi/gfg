package com.array.gfg;

public class sum_matrix {

	public class point {
		private int x;
		private int y;

		point(int x, int y) {
			this.x = x;
			this.y = y;

		}
	}

	private static int check = 0;
	private static int[] row_sum;
	private static int[] col_sum;
	private static int sum_total=0;
	private static point pt1;
	private static point pt2;
	private static point pt3;

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 4 },
						{ 45, 6, 8 },
						{ 12, 4, 8 } 
						};
		sum_matrix sum1 = new sum_matrix();
		int n = arr.length;
		row_sum=new int[n];
		col_sum=new int[n];
		
		pt1 = sum1.new point(0, 1);
		pt2 = sum1.new point(0, 0);
		pt3 = sum1.new point(2, 1);
		sum1.fun1(arr, pt1);
		sum1.fun1(arr, pt2);
		sum1.fun1(arr, pt3);

	}

	public static void fun(int[][] arr, point p1) {
		int sum = 0;
		int n = (arr.length);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (p1.x != i && p1.y != j) {
						sum += arr[i][j];

					}
				}
			}
		
		System.out.println("sum is:" + sum);

	}

	public  void fun1(int[][] arr, point p1) {

		int sum = 0;int count=0;
		int n = (arr.length);
		if (check == 0){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum_total += arr[i][j];
				row_sum[i] += arr[i][j];
				col_sum[j] += arr[i][j];
			}

		}
		}
		check=1;
		sum = sum_total - row_sum[p1.x] - col_sum[p1.y] + arr[p1.x][p1.y];

		System.out.println("sum is: " + sum);
	}

}
