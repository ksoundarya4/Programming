package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class Harmonic {
	
	
	public static void PrintHarmonics(int N)
	{
		if(N!=0)
		{
		double harmonic = 0;
		String s ="";
		for(int i = 1; i<=N; i++)
		{
			System.out.print(s+"1/"+i+"+");
			harmonic = harmonic + (double)1/i;
			
		}
		
		System.out.println("Harmonic of N is = "+harmonic);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter an integer to check harmonics");
		int num = utilclass.InputInteger();
		PrintHarmonics(num);
	}
}
