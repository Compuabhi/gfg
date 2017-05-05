package com.array.gfg;

import java.io.*;

public class max_subarray_28_08_15 {

public static void main(String[] args) throws NumberFormatException, IOException{
	int []arr={1, 12, -5, -6, 50, 3};
	System.out.println("eneter the length of substring");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int k=Integer.parseInt(br.readLine());
	fun(arr,k);
}

public static void fun(int[]arr,int k){
	int n=arr.length,i;
	int[]csum=new int[n];
	csum[0]=arr[0];
	for( i=1;i<n;i++){
		csum[i]=csum[i-1]+arr[i];
	}
	int max_sum=csum[k-1];	
	int max_start=0;
	int temp;
	for(i=1;i<=n-k;i++){
		temp=csum[i+k-1]-csum[i-1];
		if(temp>=max_sum)
		{
			max_sum=temp;
			max_start=i;
		}

	}
	
	System.out.println("max substring starts at"+ max_start);
}

}
