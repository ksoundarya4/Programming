package com.bridgelabs.AlgorithmPrograms;

import java.util.Arrays;

import com.bridgelabs.util.utilclass;

public class Anagram {
	
	public static boolean isAnagram(String s1, String s2)
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if(s1.length()!=s2.length())
			return false;
		else
		{
			Arrays.sort(ch1);
			
			Arrays.sort(ch2);
			
			for(int i = 0 ;i<s1.length(); i++)
			{
				if(ch1[i] != ch2[i])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter  two string to check for anagram");
		String s1 = utilclass.InputString();
		String s2 = utilclass.InputString();
		
		if(isAnagram(s1,s2))
			System.out.println("Strings are anagram");
		else
			System.out.println("String are not anagram");
	}
}
