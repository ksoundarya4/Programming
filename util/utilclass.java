package com.bridgelabs.util;

import java.util.Scanner;

public class utilclass<T> {
	
	public static String InputString()
	{
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();
		return str;
		
	}
	
	public static int InputInteger()
	{
		
		Scanner sc1 = new Scanner(System.in);
		 int i = sc1.nextInt();
		 return i;
		}
	
	public static double InputDouble()
	{
		Scanner sc1 = new Scanner(System.in);
		double d = sc1.nextDouble();
		return d;
		}
	
	public static boolean InputBoolean()
	{
		Scanner sc1 = new Scanner(System.in);
		boolean b = sc1.nextBoolean();
		return b;
	}
	 
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


}
