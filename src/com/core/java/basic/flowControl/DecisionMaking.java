package com.core.java.basic.flowControl;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class DecisionMaking {

	public static void main(String[] args) {

		IfDemo demo = new IfDemo();
		//demo.ifTest();
		demo.switchCase();

	}

}

@Setter
@Getter
class IfDemo {
	public void ifTest() {

		System.out.println(
				"This program is use for if and else where we have to put 2 no. for cheking which no is grater than other");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");
		int i = sc.nextInt();
		System.out.println("Enter Second integer");
		int j = sc.nextInt();
		sc.close();
		if (i < j) {
			System.out.println(i + "  is less than " + j);
		} else {
			System.out.println(j + "  is less than " + i);
		}
	}
	public void nestedIf() {
		System.out.println(
				"This program is use for  describing nested if and else ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");
		int i = sc.nextInt();
		System.out.println("Enter Second integer");
		int j = sc.nextInt();
		sc.close();
		if (i < j) {
			System.out.println(i + "  is less than " + j);
			if(i<10)
			{
				System.out.println(i + "  is less than 10");
			}
			
		} else {
			System.out.println(j + "  is less than " + i);
		}
	}
	
	public void elseIf()
	{
		 
	        // initializing expression 
	        int i = 20; 
	  
	        // condition 1 
	        if (i == 10) 
	            System.out.println("i is 10\n"); 
	  
	        // condition 2 
	        else if (i == 15) 
	            System.out.println("i is 15\n"); 
	  
	        // condition 3 
	        else if (i == 20) 
	            System.out.println("i is 20\n"); 
	  
	        else
	            System.out.println("i is not present\n"); 
	  
	        System.out.println("Outside if-else-if"); 
	   
	}
	
	public void switchCase()
	{
		int operation = 1;
		int number = 10;

		switch (operation) {
		    case 1:
		        number = number + 10;
		    
		    case 2:
		        number = number - 4;
		       
		    case 3:
		    	
		        number = number / 3;
		        
		    case 4:
		        number = number * 10;
		        break;
		        default:
		        number = number * 2;
		        break;
		          
		}
		System.out.println(number);
	}
	
	
	public void breakDemo()
	{
		for (int i = 0; i < 10; i++) 
		{
		System.out.println(i);
		if(i==3)
		{
			break;
		}
		}
	}
	
	public void continueDemo()
	{
		for (int i = 0; i < 10; i++) 
		{
		
		if(i==3)
		{
			continue;
		}
		System.out.println(i);
		}
	}
	
	public void returnDemo()
	{
		for (int i = 0; i < 10; i++) 
		{
		
		if(i==3)
		{
			return;
		}
		System.out.println(i);
		}
		
		 
	}
	
}