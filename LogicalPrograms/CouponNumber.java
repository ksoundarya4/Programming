package com.bridgelabs.LogicalPrograms;

import com.bridgelabs.util.utilclass;

public class CouponNumber {
	
	public static int GenerateRandom()
	{
		return (int)(Math.random()*1000);
		}
	
	public static void main(String[] args)
	{
		System.out.println("Enter number of Coupon to be generated");
		int N = utilclass.InputInteger();
		
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++)
		{
			arr[i] = GenerateRandom();
			count++;
			int check = arr[i];
				for(int j = 0; j<i ; j++)
				{
					if(arr[i] == arr[j])
					{
						arr[j] = GenerateRandom();
						count++;
						continue;
					}
				}
			
				
			
			}		
	
		for(int i =0;i<N; i++)
		System.out.println(arr[i]);
	System.out.println("Random numbers needed to generate distinct coupons = "+count);
	
		
	}
	
	

}
