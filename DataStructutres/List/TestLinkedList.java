package com.bridgelabs.DataStructutres.List;

import com.bridgelabs.util.utilclass;

public class TestLinkedList {

	public static void main(String[] args) 
	{
	UnOrderedList<String> l = new UnOrderedList<String>();
	
	String path ="C://Users//soundarya k//BridgeLabz//BridgeLabz_Programs//com//bridgelabs//DataStructutres//List//sample.txt";
	
	String[] value = utilclass.ReadFile(path);
	for(String word : value)
		l.add(word);
	
	System.out.println(l);
	
System.out.println("Enter a word to search or add");
String word = utilclass.InputString();
if(l.Search(word))
	l.Remove(word);
else
	l.add(word);

System.out.println(l);
	
}
}
