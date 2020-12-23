package com.core.java.basic.flowControl;

public class Loop {
	public static void main(String args[])
	{
		Loop loop=new Loop();
		loop.doWhile();
	}
	public void whileLoop()
	{
		int a=10;
		int i=1;
		while(i<=a)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void forLoop()
	{
		int a=10;
		for(int i=1; i<=a;i++)
		{
			System.out.println(i);
		}
	}
	
	public void enhanceFor()
	{
		int a[]= {1,2,3,4,5};
		
		for(int b:a)
		{
			System.out.println(b);
		}
	}
	public void doWhile()
	{
		int a=10;
		int i=10;

		do {
			
		System.out.println("a");
	}while(i<a);
	}
	 
}
