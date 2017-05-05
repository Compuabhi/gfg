package com.array1.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

 class hashClass {
	
	private ArrayList<Integer> arr;
	private HashMap<Integer,Integer> map;
	
	
	hashClass(){
		arr=new ArrayList<Integer>();
		map=new HashMap<Integer,Integer>();
		
	}
	
	 void insert(int x){
		if(map.get(x)!=null)
			return;

		arr.add(x);
		map.put(x,arr.size()-1);
		
	}
	 void delete(int x){
		 if(map.get(x)==null)
			 return;
		 int index=map.remove(x);
		 Collections.swap(arr, index, arr.size()-1);
		 arr.remove(arr.size()-1);
		 map.put(arr.get(index),index);
		 
		
	}
	 void search(int x){
		
		 if(map.get(x)==null)
		 {
			 System.out.println("not found"+x);
			 return;
		 }
		 else 
		 System.out.println("found at index"+map.get(x));
		 
		
	}
	 
	 int getRandom(){
		Random rand=new Random();
		int index=rand.nextInt(arr.size());
		return arr.get(index);
		
	}
	

	
}


public class hashClassMain{
	
	public static void main(String[]args){
		hashClass hash=new hashClass();
		
		hash.insert(5);
		hash.insert(7);
		hash.search(4);
		hash.insert(9);
		hash.search(7);
		hash.delete(7);
		hash.search(7);
		System.out.println(hash.getRandom());
		System.out.println(hash.getRandom());
		System.out.println(hash.getRandom());
	}
	
}
