package com.array.gfg;
//this is 2-way quick sort

public class three_way_quicksort {
	
	
	
	public static void main(String []args){
		int []arr={2,3,3,12,12,14,16,18,20};
		quicksort(arr,0,arr.length-1);
		for(int x: arr)
			System.out.print(" "+x);
		
		
	}
	
	public static int partition(int []arr,int start,int end){
		
		int p_index=start;
		int pivot=arr[end];
		for(int i=start;i<end;i++){
			if(arr[i]<=pivot)
			{	swap(arr,i,p_index);
				p_index++;
			}
			
		}
		swap(arr,p_index,end);
		
		return p_index;
		
	}
	
	public static void quicksort(int[] arr,int start,int end){
		int p_index;
		if(start<end){
		p_index=partition(arr,start,end);
			quicksort(arr,start,p_index-1);
			quicksort(arr,p_index+1,end);
			
		}
		
		
		
	}
	

	
	public static void swap(int[]arr,int i,int j){
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
