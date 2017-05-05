package com.array1.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ArrayList<Integer> arr=new ArrayList<Integer>();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=(br.readLine());
//		String []arr2=str.trim().split("\\s+");
//		for(String str2:arr2)
//			arr.add(Integer.parseInt(str2));
//		for(int str2:arr)
//		System.out.print((str2)+" ");
		
		Scanner sc=new Scanner (System.in);
		Scanner sc2=new Scanner (System.in);
		int x=sc.nextInt();
		while(x!=-1){
			arr.add(x);
			x=sc.nextInt();
		}
		
		
		String str=sc2.nextLine();
		System.out.print((str)+" ");
		for(int str2:arr)
			System.out.print((str2)+" ");
	}
			
			
}