package com.bridgelabs.LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

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
		
		int count = 0;
		
		List<Integer> l = new ArrayList<Integer>();
		
		int[] arr = new int[N];
		
		
		
		for(int i = 0; i<N; i++)
		{
			arr[i] = GenerateRandom(N);
			l.add(arr[i]);
		}
		System.out.println(l);
		
		for(int i =0; i<N; i++)
		{
			int key = arr[i];
			if(l.contains(key))
				l.remove(key);
		}
		
		System.out.println(l);
	//	System.out.println("Random Numbers generated are = "+count);
	}				
	


}
