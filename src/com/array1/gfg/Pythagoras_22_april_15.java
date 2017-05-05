package com.array1.gfg;

public class Pythagoras_22_april_15 {

	
	public static void main(String[] args){
		
		int[]arr={10, 4, 6, 12, 5};
		fun(arr);
	}
	
	public static void fun(int[] arr){
		int[]sqarr=new int[arr.length];
		int i=0,n=arr.length,hypo,l,r;
		for(int x:arr){
			sqarr[i++]=(int) Math.pow(x, 2);
		}
		i=n-1;
		
		while(i>=2){
			hypo=sqarr[i];
			l=0;
			r=i-1;
			while(l<r){
				if(sqarr[l]+sqarr[r]==hypo)
				{
					System.out.println("it has a pythagoras triplet:"+(int)Math.sqrt(sqarr[l])+" "+(int)Math.sqrt(sqarr[r])+" "+(int)Math.sqrt(hypo));
					return;
				}
				else if(sqarr[l]+sqarr[r]<hypo)
					l++;
				else
					r--;
				
				
				
			}i--;
		}
		
		System.out.println("it does not have a pythagoras triplet");
	}
	
	
}
