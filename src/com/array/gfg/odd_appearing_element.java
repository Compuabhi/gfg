package com.array.gfg;

public class odd_appearing_element {

	public static void main(String[] args) {
		int result;
		int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 3, 600, 600, 4, 4};
		result = fun(arr, 0, arr.length-1);
		System.out.println("result is:"+result);

	}

	public static int fun(int[] arr, int start, int end) {

		int mid = start+(end - start)/ 2;
		System.out.println("value is:"+ mid );
		int left = mid - start;
		if (start == end)
			return arr[start];
		else {
			if (left % 2 == 0 && arr[mid] == arr[mid + 1])
				return fun(arr, mid + 2, end);
			else if (left % 2 != 0 && arr[mid] == arr[mid +1])
				return fun(arr, start, mid - 1);
			else if (left % 2 == 0 && arr[mid] != arr[mid + 1])
				return fun(arr, start, mid);
			else
				return fun(arr, mid+1, end);

		}

	}

}