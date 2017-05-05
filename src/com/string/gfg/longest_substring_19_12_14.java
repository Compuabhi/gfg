package com.string.gfg;
/*
public class longest_substring_19_12_14 {

	public static void main(String[] args) {
		fun("1538023");
	}

	public static void fun(String str) {
		char[] str1 = str.toCharArray();
		int evenlen = str1.length / 2 * 2;
		int n = str1.length;
		int sum1 , sum2 ;
		System.out.println(('3'+1));

		while (evenlen > 0) {
			int i = 0;
			while (i <= n - evenlen) {
				sum1=0;
				sum2=0;
				for (int j = i; j <= i+evenlen / 2 - 1; j++) {
					sum1 += (str1[j]-'0');
					sum2+=(str1[j+evenlen/2]-'0');
				}
				if (sum1 == sum2) {
					System.out.println("result of longest substring having sum of kleft == kright: " + evenlen);
					return;
				}

				i++;
			}
			evenlen-=2;
		}
		
		System.out.println("result is" + 0);
	}

}
*/
public class longest_substring_19_12_14 {

	public static void main(String[] args) {
		fun("1538023");
	}

	public static void fun(String str) {
		char[] str1 = str.toCharArray();
		
		int n = str1.length;
		int[][] sum=new int[n][n];
		int maxlen=0;

		for(int i=0;i<n;i++)
		{
			sum[i][i]=str1[i]-'0';
		}
		int i,j,k;
		int len=2;
		while(len<=n){
			i=0;
			while(i<=n-len){
				
				j=i+len-1;
				k=(j-i)/2;
				sum[i][j]=sum[i][i+k]+sum[i+k+1][j];
				System.out.println(sum[i][j]+"  "+i+" "+j);
				if(len%2==0 && sum[i][i+len/2-1]==sum[(i+len/2)][i+len-1])
					maxlen=len;
				
				i++;
			}
			
			len++;
		}
		
		System.out.println("the length of largest string is: "+maxlen);
		
		
		
		

}



}
