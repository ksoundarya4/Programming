package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class PowerOf2 {
	


	public static void PrintPowerOf2(int N)

	{
		int[] power = new int[N];
		power[0] = 1;
		for(int i = 1; i<N; i++)
		{
			 power[i] = 2*power[i-1];
			 System.out.println("2 Power of "+i+ "=" +power[i]);
			 
		//	 System.out.println(Math.pow((double)2,(double)i));
		}
		
	}

	public static void main(String[] args)
	{
		System.out.println("Enter an integer to printpowerof2");
		int num = utilclass.InputInteger();
		PrintPowerOf2(num);
	}
}
