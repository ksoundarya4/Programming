package com.bridgelabs.DataStructutres.Stack;

import java.util.ArrayList;

public class ArrayStack<T>
{
	ArrayList<T> l = new ArrayList<T>();

public void push(T data)
{
	l.add(data);
}

public T pop()
{
	if(!l.isEmpty())
	{
		T data = l.get(l.size()-1);
		l.remove(l.size()-1);
		return data;
	}
	else
	{
		System.out.println("Stack is Empty");
		return null;
	}
}
 public T peek()
 {
	 if(!l.isEmpty())
	 return l.get(l.size()-1);
	 else
	 {
		 System.out.println("Stack is Empty");
		 return null;
	 }
 }
 
public boolean isEmpty()
{
	if(l.isEmpty())
		return true;
	return false;
}
public int size()
{
	return l.size();
}
}