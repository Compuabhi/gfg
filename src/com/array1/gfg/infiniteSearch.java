package com.array1.gfg;

public class infiniteSearch {

	public static void main(String[] args) {

		int[] arr = {12,34,56,78,134,1100,1110,2100,2300,2310,2345,2348,2378};

		int key=2310;
		int check=fun(arr, key, 0, 1);
		if(check!=-1)
			System.out.println(key+" element found "+"at "+check+"th position");
		else
			System.out.println("not found");

	}

	static int fun(int[] arr, int key, int start, int end) {

		if(key>arr[end])
		{
			start=end;
			end=2*end;
		}
		int mid;
		if (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				return fun(arr, key, mid + 1, end);
			else
				return fun(arr, key, start, mid - 1);

		}
		return -1;

	}

	
	
}


