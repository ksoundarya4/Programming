package com.bridgelabs.JunitPrograms;

import com.bridgelabs.util.utilclass;

public class Binary {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to be converted");
		int num = utilclass.InputInteger();
	
		//To obtain binary of integer
	int[] binary = utilclass.toBinary(num);
	//To print binary digits of number
	for(int i =0; i<binary.length; i++)
	{
		System.out.print(binary[i]);
	}
	
	//To swap nibbles in number
	int swapNibble = Swapnibble(num);
	System.out.println();
	System.out.println("Number after swaping nibbles = "+swapNibble);
	
	
	//To check if swapped number is a power of 2
	if(isPowerOf2(swapNibble))
	System.out.println("The swapped number "+swapNibble+ " is power of 2");
	else
		System.out.println("The swapped number "+swapNibble+ " is  not power of 2");
}
	
	
	//Method to swap nibbles
	public static int Swapnibble(int num)
	{
		return ((num & 0x0f) << 4) | ((num & 0xf0) >> 4);
	
	}
	
	//Method to check is power of two
	public static boolean isPowerOf2(int num)
	{
		if(num == 0)
			return false;
		while(num!=1)
		{
			if(num%2==1)
				return false;
			num=num/2;
		}
		return true;
	}
		
		

	

}
