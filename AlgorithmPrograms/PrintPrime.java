package com.bridgelabs.AlgorithmPrograms;


import com.bridgelabs.util.utilclass;

public class PrintPrime {

	public static void main(String[] args)
	{
//	List<String> l = new ArrayList<String>();
//	String[] str = null;
	for(int i = 0; i<=1000; i++)
		{
		//To find prime numbers in 0-1000 range
			//and to check palindrome
			
			String s = Integer.toString(i);
			
		if(utilclass.isPrime(i) && utilclass.isPalindrome(s))
		System.out.println(i);
	
		
		}
		
	
		
	}

}
