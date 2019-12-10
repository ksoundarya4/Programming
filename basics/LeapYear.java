package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class LeapYear {
	
	private int year ;
	
	public int getYear() {
		return year;
	}

	public void setYear(int y)
	{
	
		if(utilclass.NumberOfDigits(y) == 4)
			this.year = y;
		else
		{
			System.out.println("Enter Correct year format");
			throw new NullPointerException();
		}
	}

	public boolean IsLeapYear()
	{
		
		if((year % 400 == 0) || ((year % 4 ==0) && (year % 100!=0)))
				return true;
		
		return false;
		}
}
