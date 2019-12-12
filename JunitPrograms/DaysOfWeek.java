package com.bridgelabs.JunitPrograms;

import com.bridgelabs.util.utilclass;

public class DaysOfWeek {
	
	//To Print the Day of the date
	public static  String PrintDay(int year,int month,int date)
	{
	
		int day = utilclass.Day(year, month, date);
		
		switch(day)
		{
			case 0 : return "Sunday";
			case 1 : return "Monday";
			case 2 : return "Tuesday";
			case 3 : return "Wednesday";
			case 4 : return "Thursday";
			case 5 : return "Friday";
			case 6 : return "Saturday";
			
			default : return "Enter correct date";
		}
		
	}

	public static void main(String[] args)
	{
		int y=0;
		int m =0;
		int d=0;
		//Accept input through Command Line Arguments
		if(args.length>0)
		{
			 y = Integer.parseInt(args[0]);
			 m = Integer.parseInt(args[1]);
			 d = Integer.parseInt(args[2]);
		}
		
		System.out.println(PrintDay(y,m,d));
		
		}
	}

