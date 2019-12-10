package com.bridgelabs.FunctionalProgram;


import com.bridgelabs.util.utilclass;

public class TestFuctionalPrgm {
	
	public static void main(String[] args)
	{
		
	/*	System.out.println("Enter which array to to use: InterArray,DoubleArray or BooleanArray");
		String s = utilclass.InputString();
		
		Array2D a2 = new Array2D();
		
		a2.SelectArray(s);
	*/
	AddsToZero A2Zero = new AddsToZero();
	int[] a = A2Zero.ReadInteger();
		A2Zero.Triplets(a);
		
	}
	
	

}
