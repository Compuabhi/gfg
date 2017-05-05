package com.array1.gfg;

public class reArrangement_25_02_2015 {

	
	public static void main(String[]args){
		
		int arr[] = {2, 0, 1, 4, 5, 3};
		fun1(arr);
		
		
		
		
	}
	
	static void fun(int[]arr){
		
		int index=0,i=0;int index1,val1;
		int val=arr[0];
		while(i<arr.length){
			
			index1=arr[val];
			val1=arr[index1];
			
			arr[val]=index;
			val=index1;
			index=val1;
			
			
			i++;
			
		}
		for(int x:arr)
			System.out.print(" "+x);
		
	}

	static void fun1(int[]arr){
		int n=arr.length,i;
		for( i=0;i<n;i++)
			arr[arr[i]%n]+=n*i;
		for(i=0;i<n;i++)
			arr[i]=arr[i]/n;
		
		for(int x:arr)
			System.out.print(" "+x);
		
	}
	
}
