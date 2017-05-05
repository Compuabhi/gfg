package com.string.gfg;

import java.util.Arrays;

public class customers_returned_3_3_15 {
	
	public static void main(String[]args)
	{
		String str="ABCBCA";
		int result=returnFun(1,str.toCharArray());
		System.out.println(result);	
	}
	public static int returnFun(int n,char[] str) 
	{
		int[] status=new int[26];
		Arrays.fill(status,0);
		int i=0,m=0;
		while(i<str.length)
		{
			if(n>0 && status[str[i]-65]==0 )
			{status[str[i]-65]=1;
			n--;
			i++;
			}
			else if(n==0 && status[str[i]-65]==0)
			{	m++;
				status[str[i]-65]= -1;
				i++;
			}
			else if(n==0 && status[str[i]-65]==-1)
				{i++;
				}
				else
				{
				n++;
				i++;
				}
		}
		System.out.println("the no. of returned customers is:"+m);
		return m;
		
	}

}
