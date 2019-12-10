package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class PowerOf2 {
	
	private int N;
	
	
	public int getN() {
		return N;
	}

	public void setN(int n) {
		
		System.out.println("Enter a Number");
		n = utilclass.InputInteger();
		if(n>0 && n<31)
		N = n;
		
		
	}
	

	public void PrintPowerOf2()

	{
		int[] power = new int[N];
		power[0] = 1;
		for(int i = 1; i<N; i++)
		{
			 power[i] = 2*power[i-1];
			 System.out.println("2 Power of "+i+ "=" +power[i]);
		}
		
	}

}
