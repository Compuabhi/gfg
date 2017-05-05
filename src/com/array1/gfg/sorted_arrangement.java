package com.array1.gfg;

import java.awt.List;
import java.util.ArrayList;

public class sorted_arrangement {

	public static void main(String []args){
		
	int[] arr1 = {10, 15, 25};
	int[] arr2 = {1, 5, 20, 30};
		
		
		fun(arr1,arr2);
		
		
	}
	public static void fun(int[]arr1,int[]arr2){
		
		int previous=arr1[0];
		ArrayList<Integer> result=new ArrayList<Integer>();
		int k=0,i,j=0;
		
		while(k==arr1.length){
			
			result.add(arr1[k]);
			i=k;j=0;
			
			while(j<arr2.length ){
				if(previous<=arr2[j])
					{result.add(arr2[j]);
					previous=arr2[j];
					j++;
					for(int x:result)
					System.out.print("sorted array is:"+x+" ");
					}
				while(i<arr1.length && arr1[i]<previous)
				i++;
			}
				
			
			
			
			if(j==arr2.length)
			{result.clear();
			k++;
				
			}
			
			result.add(arr2[j]);
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}
	
}
