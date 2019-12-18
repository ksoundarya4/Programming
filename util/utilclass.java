package com.bridgelabs.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class utilclass {
	
	//To get String input from keyboard
	public static String InputString()
	{
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		return str;
		
	}
	
	//To get Integer type input from Keyboard
	public static int InputInteger()
	{
		
		Scanner sc1 = new Scanner(System.in);
		 int i = sc1.nextInt();
		 return i;
		}
	
	//To get Double type input from Keyboard
	public static double InputDouble()
	{
		Scanner sc1 = new Scanner(System.in);
		double d = sc1.nextDouble();
		return d;
		}
	
	//To get boolean input from keyboard
	public static boolean InputBoolean()
	{
		Scanner sc1 = new Scanner(System.in);
		boolean b = sc1.nextBoolean();
		return b;
	}
	
	//To get number of digits in an Integer
	public static int NumberOfDigits(int num)
	 {
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		return count;
	 }
	
	//To verify a number is Prime or not
	public static boolean isPrime(int num)
	{
		if(num==0 || num ==1)
		return false;
		
		if(num==2)
			return true;

		if(num%2==0)
		return false;

		for(int i = 3; i<=(int)Math.sqrt(num); i+=2)
		{
			if(num%i==0)
			return false;
		}
		return true;
	}

	//To find day of the date
	public static int Day(int year, int month ,int date)
	{
		 year = year - (14-month)/12;
		int x = year + (year/4) - (year/100) + (year/400);
		 month = month + 12*((14-month)/12)-2;
		
		return (date+x+(31*month)/12)%7;
		
	}
	
	//To convert Temperature from Celsius to Fahrenheit and visaversa
	public static void TempConversion(float temp,int ch)
	{
		switch(ch)
		{
		case 1 : temp = (temp*9/5)+32;
					System.out.print("Temperature from Celsius to Fahrenheit is : "+temp);
					break;
		case 2 : temp = (temp - 32)*5/9;
					System.out.print("Temperature from Fahrenheit to Celsius is : "+temp);
					break;
		default : System.out.println("Enter valid case");
		}
	}

	//To calculate monthlyPayment
	public static double MontlyPayment(int P , int Y , int R)
	{
		int n = 12*Y;
		double r = 1.0*R/(12*100);
		
		double payment = (P*r)/(1-Math.pow((1+r), (-n)));
		
		return payment;
	}
	
	//To claculate Square root using Newtons Method
	
	public static double sqrt(int num)
	{
		double t = num;
		double epsilon = 1e-15;
		
		while(Math.abs(t-num/t) > epsilon*t)
		{
			t = (num/t + t)/2.0;
			
			}
		return t;
		}
	
	//To Convert integer to binary form(base 2)
	public static int[] toBinary(int num)
	{
		
		int[] arr = new int[16];
	
		int i =0;
		while(num>0)
		{
			arr[i] = num%2;
			num = num/2;
			i++;
		}
		//Swapping elements in an array
		for(int j=0; j< (arr.length-1)/2 ; j++)
		{
			
			arr[j] = arr[j] ^ arr[arr.length-1-j];
			arr[arr.length-1-j] = arr[j] ^ arr[arr.length-1-j];
			arr[j] = arr[j] ^ arr[arr.length-1-j];
		}
		
	return arr;	
	}
	
	//To check for palindrome
	public static boolean isPalindrome(String s)
	{
		StringBuilder sb = new StringBuilder(s);
	String str = new String(sb.reverse());
		
		if(str.equals(s))
		 return true;
		
		return false;
	}
	
	//format date object in this format 01/12/2016 
		public static String getFormatedDate(Date date)
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
			return sdf.format(date);
		}
		
		
		//
		//Take file name as input and return string of file text
		public static String getFileText(String fileName)
		{
			BufferedReader br = null;
			
			try
			{
				br=new BufferedReader(new FileReader(fileName));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				
				while(line!=null){
					sb.append(line);
					sb.append(System.lineSeparator());
					line=br.readLine();
				}
				return sb.toString();
			 }
			catch(Exception e)
			{
				return null;
			}
			finally
			{
				try
				{
					br.close();
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}	
			}
		}
		
		   public static String[] ReadFile(String path)
		   {
			   //To read list of word seperated by comma from a file
			   BufferedReader br = null;
			  
			   
			   //To store the words
			   String[] value = null;
			   
			 try
			 {
				   br = new BufferedReader( new FileReader(path));
				   String line;
				   while((line = br.readLine())!=null)
					   value = line.split(" ");
			    }
		   
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
		   finally
		   {
			   try
			   {
				   if(br!=null)
					   br.close();
			   }
			   catch(Exception e)
			   {
			   e.printStackTrace();
			   }
			  
		   }
			 return value;
		 }
		   
}
