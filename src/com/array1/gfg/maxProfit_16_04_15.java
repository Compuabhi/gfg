package com.array1.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class maxProfit_16_04_15 {

	public static void main(String[] args){
		int price[] = {90, 80, 70, 60, 50};
		fun1(price);
		
		
	}
	
	public static void fun1(int[]arr){
		
	int n=arr.length;
	int [] profit=new int[n];
	
	for(int i=0;i<n;i++)
		profit[i]=0;
	
	int maxterm=arr[n-1];
	int i;
	for(i=n-2;i>=0;i--){
		
			profit[i]=Math.max(maxterm-arr[i],profit[i+1]);
		
			maxterm=Math.max(arr[i],maxterm);
		
	}
	int minterm=arr[0];
		for(i=1;i<n;i++){
			profit[i]=Math.max(profit[i-1],profit[i]+arr[i]-minterm);
			minterm=Math.min(minterm, arr[i]) ;		
		}
		
		
		
		
		
		System.out.println("max is:"+profit[n-1]);
		
	}
	
	public static void fun(int []arr){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=arr.length;
		int ldiff,rdiff;
		for(int i=0;i<n-1;i++){
			
			for(int j=i+1;j<n;j++){
				ldiff=0;rdiff=0;
				ldiff=partMaxdiff(arr, i, j);
				if(j+1<n)
					rdiff=partMaxdiff(arr, j+1, n-1);
				list.add(ldiff+rdiff);
			}
		
		}
		
		Object[]profit=list.toArray();
		Arrays.sort(profit);
		int t=(int)profit[profit.length-1];
		
		if(t>0)
			System.out.println("max is "+t);
		else
			System.out.println("no element found");
		
	}
	public static int partMaxdiff(int[]arr,int start,int end ){
		
		int maxDiff=0;
		
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++){
				
				if((arr[j]>arr[i]) && (maxDiff<(arr[j]-arr[i])))
					maxDiff=(arr[j]-arr[i]);
				
			}
			
			
		}
		return maxDiff;
		
	}
	
}
