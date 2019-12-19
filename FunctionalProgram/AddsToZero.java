package com.bridgelabs.FunctionalProgram;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabs.util.utilclass;

public class AddsToZero {
	
	public static int[] ReadInteger()
	{
		System.out.println("Enter number of intergers to be read");
		int N = utilclass.InputInteger();
		int[] arr = new int[N];
		
	    for(int i = 0; i<N; i++)
	    {
	    	System.out.println("Enter "+(i+1)+"th integer");
		arr[i]=utilclass.InputInteger();
	    }
	    
	    return arr;
	}
	
	public static void Triplets(int[] nums)
	{
		int count = 0;
		List<String> l = new ArrayList<String>();
		
		for(int i= 0 ;i<nums.length-2;i++)
		{
			for(int j = i+1; j<nums.length-1;j++)
			{
				for(int k = j+1;k<nums.length;k++)
				{
					if(nums[i]+nums[j]+nums[k]==0)
					{
						count++;
					l.add("["+nums[i]+","+nums[j]+","+nums[k]+"]");
					}
					
				}
			}
		}
	System.out.println("Number of triplets ="+count);
	System.out.println(l);
	}
	
	public static void main(String[] args)
	{
		
		int[] a = ReadInteger();
			Triplets(a);
			
	}
}
