package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class Replace {
	
	public static void ToReplace()
	{
		String  s1 = "Hello <<UserName>> ,How are you ?";
		System.out.println("Enter your name");
		String s2 = utilclass.InputString();
		
		StringBuffer sb = new StringBuffer(s1);
	sb = sb.replace(s1.indexOf("<<"),(s1.indexOf(">>")+2), s2);
		
		
		System.out.println(sb);		
	}
}

	
		

	
