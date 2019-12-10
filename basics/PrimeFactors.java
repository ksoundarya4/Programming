package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class PrimeFactors {
	
	public static void PrintPrimeFactor(int N)
	{
	
		
		if(utilclass.isPrime(N))
			System.out.println(N);  //if Number is prime then it has no prime factors.
		
		if(N%2==0)
		{
			N = N/2;
			System.out.println("2"+" ");
		}
		
		for(int i = 3; i<=N; i+=2)      //using i*i<=N will produce wrong outputs for smaller numbers.
		{
			if(N%i==0)
			{
				if(utilclass.isPrime(i))
			System.out.println(i+" ");
			}
			
		}
		
	}
	
		public static void main(String[] args)
		{
			System.out.println("Number to find prime factors");
			int N = utilclass.InputInteger();
			PrintPrimeFactor(N);
		}

}
