package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class Harmonic {
	
	private int N;

	public int getN() {
		return N;
	}

	public void setN(int n) {
		if(n!=0)
		N = n;
	}
	
	public void PrintHarmonics()
	{
		double harmonic = 1;
		String s ="";
		for(int i = 2; i<=N; i++)
		{
			System.out.print(s+"1/"+i+"+");
			harmonic = harmonic + (double)1/i;
			
		}
		System.out.println("Harmonic of N is = "+harmonic);
	}
	

}
