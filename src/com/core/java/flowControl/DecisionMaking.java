package com.core.java.flowControl;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class DecisionMaking {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		IfDemo demo = new IfDemo();
		
		demo.ifTest(myObj.nextInt(), myObj.nextInt());
		myObj.close();
	}

}

@Setter
@Getter
class IfDemo {
	public void ifTest(int i, int j) {
System.out.println("This program is use for if and else where we have to put 2 no. for cheking which no is grater than other");
		if (i < j) {
			System.out.println(i + "  is less than " + j);
		}
		else
		{
			System.out.println(j + "  is less than " + i);
		}
	}
}