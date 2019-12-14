package com.bridgelabs.AlgorithmPrograms;

import com.bridgelabs.util.utilclass;

public class BubbleSort {
	
	public static int[] Bubblesort(int[] arr )
	{
		for(int i =0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
				int	temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
				
		}
	return arr;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter  10 integer numbers to sort");
	int[] a = new int[10];
	//Accept integer input
		for(int i = 0; i<a.length;i++)
			a[i] = utilclass.InputInteger();
		
		a = Bubblesort(a);
		for(int i = 0 ; i<a.length; i++)
			System.out.print(a[i]+" ");
	}

}
