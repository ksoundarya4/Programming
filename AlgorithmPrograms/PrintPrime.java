package com.bridgelabs.AlgorithmPrograms;

import com.bridgelabs.util.utilclass;

public class PrintPrime {

	public static void main(String[] args)
	{
		for(int i = 0; i<=1000; i++)
		{
			if(utilclass.isPrime(i))
				System.out.println(i);
		}

	}

}
