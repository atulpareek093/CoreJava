package com.core.java.flowControl;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class DecisionMaking {

	public static void main(String[] args) {

		IfDemo demo = new IfDemo();
		//demo.ifTest();
		demo.nestedIf();

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
	
}