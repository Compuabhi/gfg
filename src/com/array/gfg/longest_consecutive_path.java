package com.array.gfg;

public class longest_consecutive_path {
	
	public static void main(String[]args){
		char [][]arr={ {'a', 'c', 'd'},
                {'h', 'b','e'},
                {'i','g', 'f'}
                };
		char check='c';
		fun(arr,check);
		
	}
	private static void fun(char[][]arr,char start){
		int i=0,j=0,flag=0,flag1=0;
		int k,l;
		int n=arr.length;
		String str=""+start;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				if(arr[i][j]==start)
					{flag=1;
					break;
				
					}
			}
			if(flag==1)
				break;
			
		}
		System.out.println("value is 1"+i+" "+j);
		
		while(true){
			flag1=0;
//			using outer loop
			outer:
			for(k=-1;k<=1;k++){
				for(l=-1;l<=1;l++){
					if((( i+k)<0 || (j+l)<0 ) ||(l==0 && k==0)||( i+k)>=n || (j+l)>=n )
						continue;
					if(arr[i+k][j+l]==(start+1))
					{	start=arr[i+k][j+l];
						i=i+k;
						j=j+l;
						str+=String.valueOf(start);
						flag1=1;
						break outer;
					}
				}
			}
//			System.out.println("value is 3");
			
			if(flag1==0)
				break;
			
			
		}
		
		System.out.println("longest path is:"+str+"having"+str.length()+"characters");
	}

}
