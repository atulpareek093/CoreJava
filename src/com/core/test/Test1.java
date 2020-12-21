package com.core.test;

public class Test1 {
	public static void main(String arg[]) {
		 int n1=3;int n2=1;int  n3=5;int n4=7;int a=1;
		for(int i=1;i<n3; i++)
		{	
		
			for(int j =n1; j>=i; j--)
			{
				System.out.print("  ");
			}
		for(int j =1; j<=n2; j++)
		{
			
			if(j==1 || j==n2)
			{
				System.out.print("* ");
				
			}
			else
			{
				System.out.print("  ");
			}
		}
		n2=n2+2;
		System.out.println();
			 
		}
		
		
		
		for(int i=1; i <n3-1;i++)
		{
			
			for(int j=1;j<=i; j++)
			{
			System.out.print("  ");
			}
			for(int j=n3;j>=a; j--)
			{
				if(j==n3 || j==a)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			 a=a+2;
			System.out.println();
		}
		 
	}

	 


}
