package com.core.java.basic.string;

public class StringCore {

	/*
	 * Strings in Java are Objects that are backed internally by a char array. Since
	 * arrays are immutable(cannot grow), Strings are immutable as well. Whenever a
	 * change to a String is made, an entirely new String is created
	 */
	
	public static void main(String[] args) {
		/* Using string literal */
		String s = "GeeksforGeeks"; 
		  
        // Prints the String. 
        System.out.println("String s = " + s); 
  
        // Declare String using new operator 
        String s1 = new String("GeeksforGeeks"); 
  
        // Prints the String. 
        System.out.println("String s1 = " + s1); 

	}

}
