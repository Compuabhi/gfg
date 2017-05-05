package com.array1.gfg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class rotatedArraySUM_30_03_15 {
	
	
	
	public static  void main(String[]args) throws NumberFormatException, IOException{
	
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.addAll(Arrays.asList(13,14,2,5,8,9));
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int x=Integer.parseInt(br.readLine());
//		while(x!=-1)
//			arr.add(x);
//			int num=Integer.parseInt(br.readLine());
	int num=67;
		fun(arr,num);
		
}
	static void fun(ArrayList<Integer> arr,int num){
		int i,n=arr.size();
		for(i=0;i<n;i++){
			if(arr.get(i)>arr.get(i+1))
				break;
		}
		
		int maxi=i;
		int mini=i+1;
		if(i==n){
			maxi=n-1;
			mini=0;
		}
		
		while(mini!=maxi){
			
			if(arr.get(mini)+arr.get(maxi)==num)
			{
				System.out.println("found the element");
				System.out.println("there is a pair ("+arr.get(mini)+", "+arr.get(maxi)+")");
				return;
			}
			else if(arr.get(mini)+arr.get(maxi)<num)
					mini=(mini+1)%n;
			else
				maxi=(maxi+n-1)%n;
			
			
		}
		System.out.println("couldn't find the element\n"+"there is no pair");
		
		
	}
}