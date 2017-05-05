package com.array1.gfg;

import java.util.HashMap;

public class multipleOccur_31_03_15 {

	static	HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
	
	public static  void main(String[]args){
	int[]arr={4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
		int count,i;
	for(i=0;i<arr.length;i++){
		if(map.get(arr[i])==null)
			map.put(arr[i], 1);
		else
		{count=map.get(arr[i]);
		map.put(arr[i],++count);
			
		}
			
	}
	int counter=0;
	for(i=0;i<arr.length;i++){
		 counter=map.get(arr[i]);
		while(counter-->0){
			System.out.print(arr[i]+" ");
		}
		map.put(arr[i],0 );
	}
	
		
		
	}
	
	
}
