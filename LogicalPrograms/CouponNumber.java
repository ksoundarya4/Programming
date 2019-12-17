package com.bridgelabs.LogicalPrograms;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabs.util.utilclass;

public class CouponNumber {
	

	public static int GenerateRandom(int N)
	{
		return (int)(Math.random()*N);
		}
	
	public static void main(String[] args)
	{
		System.out.println("Enter number of Coupon to be generated");
		int N = utilclass.InputInteger();
		
		
		
		Set<Integer> s = new HashSet<Integer>();
		
		
		for(int i = 0; i<N; i++)
		{
			
			s.add(GenerateRandom(N));
		}
		
		System.out.println(s);
		System.out.println("Random Numbers generated are = "+s.size());
	}				
	


}
