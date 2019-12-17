package com.bridgelabs.Regex;

import java.util.Date;

import com.bridgelabs.util.utilclass;

public class TestRegex {

	public static void main(String[] args) 
	{
		Regex r = new Regex();
		UserDetails user = new UserDetails();
		
		System.out.println("Enter your name");
		user.setName(utilclass.InputString());
		System.out.println();
		
		System.out.println("Enter your Full name");
		user.setFullname(utilclass.InputString());
		System.out.println();
		
		System.out.println("Enter your Mobile Number");
		user.setPhnumber(utilclass.InputString());
		System.out.println();
		
		user.setDate(utilclass.getFormatedDate(new Date()));
		
		System.out.println(r.ConvertString(user, utilclass.getFileText("G:\\BRIDGELABZ\\regex.txt")));
		
		
	

	}

}
