package com.bridgelabs.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex 
{
	private final String Rex_Name = "<<name>>";
	private final String Rex_FullName = "<<full name>>";
	private final String Rex_Mobile_num = "91-xxxxxxxxxx";
	private final String Rex_Date = "01/01/2016";
	
	public String ConvertString(UserDetails user_details , String message)
	{
		Pattern p = Pattern.compile(Rex_Name);
		Matcher m = p.matcher(message); 
		message = m.replaceAll(user_details.getName());
		
		 p = Pattern.compile(Rex_FullName);
		 m = p.matcher(message);
		message  = m.replaceAll(user_details.getFullname());
		
		p = Pattern.compile(Rex_Mobile_num);
		m = p.matcher(message);
		message = m.replaceAll(user_details.getPhnumber());
		
		p = Pattern.compile(Rex_Date);
		m = p.matcher(message);
		message = m.replaceAll(user_details.getDate());
		
		return message;
		
	}

}
