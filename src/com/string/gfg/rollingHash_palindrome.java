package com.string.gfg;

public class rollingHash_palindrome {

	static int q=103;
	static int d=256;
	public static void main(String[]args){
		
	String str =  "aabaacaabaa";
	fun(str.toCharArray());
	
	
		
	}
	static void fun(char[] str){
		int n=str.length,j;
		int h=1;
		if(n==0)
			return;
		System.out.println(str[0]+"   yes it is a palindrome");
		if(n==1)
			return;
		int firstr=str[0]%q;
		int second=str[1]%q;

		for(int i=1;i<n;i++){
			if(firstr==second)
			{
				for( j=0;j<=i/2;){
					if(str[j]==str[i-j])
						j++;
					else
						break;
					
				}
				if(j==i/2+1)
					System.out.println(String.valueOf(str).substring(0, i+1)+"   yes it is a palindrome");
				else
					System.out.println(String.valueOf(str).substring(0, i+1)+"   no it is not a palindrome");
			}
			else
				System.out.println(String.valueOf(str).substring(0, i+1)+"   no it is not a palindrome");
			
			if(i<n-1){
				if(i%2==0)
				{
					h=(h*d)%q;
					firstr=(firstr+str[i/2]*h)%q;
					second=(second*d+str[i+1])%q;
					
				}
				else{
					 second=(d*(second  - str[(i+1)/2]*h)  + str[i+1])%q;
					if(second<0)
						second=second+q;
	                        
				}
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
}
