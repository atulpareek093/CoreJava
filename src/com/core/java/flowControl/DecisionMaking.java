package com.core.java.flowControl;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class DecisionMaking {

	public static void main(String[] args) {
	 Scanner myObj = new Scanner(System.in);  
	IfDemo demo=new IfDemo();
	demo.ifTest(myObj.nextInt(),myObj.nextInt());

	}

}
@Setter
@Getter
class IfDemo 
{ 
    public   void ifTest( int i,int j) 
    { 
        
  
        if (i < j)
        {
            System.out.println(i+"  is less than "+j); 
        } 
} 
}