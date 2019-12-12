package com.bridgelabs.JunitPrograms;

import com.bridgelabs.util.utilclass;

public class TemperatureConversion {
	

	public static void main(String[] args)
	{
		System.out.println ("Enter temperature to be converted");
		int temp = utilclass.InputInteger();
		
		System.out.println("Enter 1 to convert Celsius to Fahrenheit /n Enter 2 to convert Fahrenheit to Celsius /n");
		int ch = utilclass.InputInteger();
		
		utilclass.TempConversion(temp, ch);
	}
}
