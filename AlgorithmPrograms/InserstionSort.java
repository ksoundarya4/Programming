package com.bridgelabs.AlgorithmPrograms;

import java.util.Scanner;

public class InserstionSort {

public static  void InsertionSortInteger(int[] arr) 
{
	for(int i = 1; i<arr.length; i++)
	{
		int j = i-1;
		int key = arr[i];
		while(j>=0 && arr[j]> key)
		{
			arr[j+1]= arr[j];
			j = j-1;
		}
		arr[j+1] = key;
		}
	for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]);
	}
	
public static  void InsertionSortStrings(String s) 
{
	String[] arr = s.split(" ");
	for(int i = 1; i<arr.length; i++)
	{
		int j = i-1;
		String key = arr[i];
		while(j>=0 && arr[j].compareTo(key) > 0)
		{
			arr[j+1]= arr[j];
			j = j-1;
		}
		arr[j+1] = key;
		}
	for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a sentence to sort");
		String s = sc1.nextLine();
		sc1.close();
		InsertionSortStrings(s);
	}
	
}


