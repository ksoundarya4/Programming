package com.bridgelabs.util;

import java.util.Scanner;

public class utilclass {
	
	//To get String input from keyboard
	public static String InputString()
	{
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();
		return str;
		
	}
	
	//To get Integer type input from Keyboard
	public static int InputInteger()
	{
		
		Scanner sc1 = new Scanner(System.in);
		 int i = sc1.nextInt();
		 return i;
		}
	
	//To get Double type input from Keyboard
	public static double InputDouble()
	{
		Scanner sc1 = new Scanner(System.in);
		double d = sc1.nextDouble();
		return d;
		}
	
	//To get boolean input from keyboard
	public static boolean InputBoolean()
	{
		Scanner sc1 = new Scanner(System.in);
		boolean b = sc1.nextBoolean();
		return b;
	}
	
	//To get number of digits in an Integer
	public static int NumberOfDigits(int num)
	 {
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	 }
	
	//To verify a number is Prime or not
	public static boolean isPrime(int num)
	{
		if(num==0 || num ==1)
		return false;
		
		if(num==2)
			return true;

		if(num%2==0)
		return false;

		for(int i = 3; i<=(int)Math.sqrt(num); i+=2)
		{
			if(num%i==0)
			return false;
		}
		return true;
	}

	//To find day of the date
	public static int Day(int year, int month ,int date)
	{
		 year = year - (14-month)/12;
		int x = year + (year/4) - (year/100) + (year/400);
		 month = month + 12*((14-month)/12)-2;
		
		return (date+x+(31*month)/12)%7;
		
	}
	

}
