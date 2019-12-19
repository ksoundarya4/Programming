package com.bridgelabs.AlgorithmPrograms;


import java.util.Arrays;

public class GenericClass<T>
{
	
	//Generic Binary Search 
public  static<T extends Comparable<T>> boolean BinarySearch(T[] arr , T value )
{
Arrays.sort(arr);

for(T a : arr)
{
	if(a.compareTo(value)==0)
		return true;
}
return false;
}

//Generic BubbleSort
public static <T extends Comparable<T>> T[] BubbleSort(T[] arr)
{
	for(int i =0; i<arr.length; i++)
	{
		for(int j = 0; j<arr.length-i-1; j++)
		{
			if(arr[j].compareTo(arr[j+1])>0)
			{
			T	temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
		return arr;
}

//Generic InsertionSort
public static<T extends Comparable<T>>  void InsertionSort(T[] arr) 
{
	for(int i = 1; i<arr.length; i++)
	{
		int j = i-1;
		T key = arr[i];
		while(j>=0 && arr[j].compareTo(key)>0)
		{
			arr[j+1]= arr[j];
			j = j-1;
		}
		arr[j+1] = key;
		}
	for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]);
	}



}

