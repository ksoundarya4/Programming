package com.bridgelabs.FunctionalProgram;

import com.bridgelabs.util.utilclass;

public class Array2D {
	
	public static void Integer2DArray()
	{
		System.out.println("Enter number of rows");
		int rows = utilclass.InputInteger();
		
		System.out.println("Enter number of coloums");
		int colms = utilclass.InputInteger();
		
		int[][] arr2D = new int[rows][colms];
		
		for(int i = 0; i<rows ; i++)
		{
			for(int j = 0; j<colms; j++)
			{
				System.out.println("Enter "+i+"th row "+j+"th coloum values");
			    arr2D[i][j] = utilclass.InputInteger();
			}
		}
		
		for(int i = 0 ;i<rows; i++)
		{
			for(int j = 0; j<colms; j++)
				System.out.print(arr2D[i][j]+" ");
			
			System.out.println();
		}
	}

	public static void double2DArray()
	{
		System.out.println("Enter number of rows");
		int rows = utilclass.InputInteger();
		
		System.out.println("Enter number of coloums");
		int colms = utilclass.InputInteger();
		
		double[][] arr2D = new double[rows][colms];
		
		for(int i = 0; i<rows ; i++)
		{
			for(int j = 0; j<colms; j++)
			{
				System.out.println("Enter "+i+"th row "+j+"th coloum values");
			    arr2D[i][j] = utilclass.InputDouble();
			}
		}
		
		for(int i = 0 ;i<rows; i++)
		{
			for(int j = 0; j<colms; j++)
				System.out.print(arr2D[i][j]+" ");
			
			System.out.println();
		}
	}
	
	public static void boolean2DArray()
	{
		System.out.println("Enter number of rows");
		int rows = utilclass.InputInteger();
		
		System.out.println("Enter number of coloums");
		int colms = utilclass.InputInteger();
		
		boolean[][] arr2D = new boolean[rows][colms];
		
		for(int i = 0; i<rows ; i++)
		{
			for(int j = 0; j<colms; j++)
			{
				System.out.println("Enter "+i+"th row "+j+"th coloum values");
			    arr2D[i][j] = utilclass.InputBoolean();
			}
		}
		
		for(int i = 0 ;i<rows; i++)
		{
			for(int j = 0; j<colms; j++)
				System.out.print(arr2D[i][j]+" ");
			
			System.out.println();
		}
	}
	
	public static void SelectArray(String s)
	{
		if(s.equals("InterArray"))
			Integer2DArray();
			
			
			if(s.equals("DoubleArray"))		
				double2DArray();
			
			if(s.equals("BooleanArray"))
				boolean2DArray();
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter which array to to use: InterArray,DoubleArray or BooleanArray");
		String s = utilclass.InputString();
		SelectArray(s);
	}
}
