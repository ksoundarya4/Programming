package com.bridgelabs.DataStructutres.List;

import com.bridgelabs.util.utilclass;

public class TestOrderedList {

	public static void main(String[] args) 
	{
		OrderedList<Integer> l = new OrderedList<Integer>();
		String path ="C://Users//soundarya k//BridgeLabz//BridgeLabz_Programs//com//bridgelabs//DataStructutres//List//TestOrderedList.txt";
		String[] values = utilclass.ReadFile(path);
		
		for(String s : values)
		{
			l.add(Integer.valueOf(s));
		}
		System.out.println(l);
		
		System.out.println("Enter an Integer to search or add");
		int input = utilclass.InputInteger();
		if(l.search(input))
			l.Remove(input);
		else
			l.add(input);
System.out.println(l);	
System.out.println(l.pop());
System.out.println(l);

		
	}

}
