package com.bridgelabs.JunitPrograms;

import com.bridgelabs.util.utilclass;

public class Netwon {

	public static void main(String[] args) {
		System.out.println("Enter the number to find  square root");
		int num = utilclass.InputInteger();
		
		System.out.println("Square root of "+num+" = "+utilclass.sqrt(num));

	}

}
