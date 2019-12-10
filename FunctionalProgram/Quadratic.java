package com.bridgelabs.FunctionalProgram;

import com.bridgelabs.util.utilclass;

public class Quadratic 
{
	public static void main(String[] args)
	{
		System.out.println("Enter three inter values to find quadratic roots");
		int a = utilclass.InputInteger();
		int b = utilclass.InputInteger();
		int c = utilclass.InputInteger();
		
		double delta = (b*b) - (4*a*c);
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.print("the roots of quadratic equation "+a+"x*x+"+b+"x+"+c+"= ");
		System.out.print(root1+","+root2);
	}
	

}
