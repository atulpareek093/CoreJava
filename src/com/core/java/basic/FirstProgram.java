package com.core.java.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Atul
 *
 */
@Getter
@Setter
public class FirstProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("This is my first program on java");
		
	}

}

/**
 * @author Atul
 *
 */
@Getter
@Setter
class DataTypes
{
	/* primitive Data Types */
	/*
	 * boolean: boolean data type represents only one bit of information either true
	 * or false, but the size of the boolean data type is virtual machine-dependent.
	 * Values of type boolean are not converted implicitly or explicitly (with
	 * casts) to any other type. But the programmer can easily write conversion code.Default Value: false
	 */
	private boolean b;
	private char c;
	/*
	 * The byte data type is an 8-bit signed two’s complement integer. The byte data
	 * type is useful for saving memory in large arrays  Size:1 byte ( 8 bits ) Values: -128 to 127, Default Value:  0
	 */
	private byte bi;
	
	/*
	 * The short data type is a 2 byte ( 16 bits ) signed two’s complement integer. Similar to
	 * byte, use a short to save memory in large arrays, in situations where the
	 * memory savings actually matters.Values: -32, 768 to 32, 767 (inclusive),Default Value: 0
	 */
	private short si;
	/* It is a 4 byte ( 32 bits ) signed two’s complement integer.    -2, 147, 483, 648 to 2, 147, 483, 647 (inclusive)*/
	private int i;
	/* he long data type is a 64-bit two’s complement integer. -9, 223, 372, 036, 854, 775, 808  to  9, 223, 372, 036, 854, 775, 807 (inclusive)*/
	private long li;
	/*
	 * he float data type is a single-precision 32-bit IEEE 754 floating-point. Use
	 * a float (instead of double) if you need to save memory in large arrays of
	 * floating-point numbers.
	 */
	private float f;
	private double d;
	
	
	
}
