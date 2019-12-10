package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class Replace {
	
	public static void ToReplace(String name)
	{
		String  s1 = "Hello <<UserName>> ,How are you ?";
		
		StringBuffer sb = new StringBuffer(s1);
	sb = sb.replace(s1.indexOf("<<"),(s1.indexOf(">>")+2), name);
		
		
		System.out.println(sb);		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter your name");
		String name = utilclass.InputString();
		
		ToReplace(name);
	}
}

	
		

	
