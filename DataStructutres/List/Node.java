package com.bridgelabs.DataStructutres.List;

public class Node<T> 
{
	private T data;
	private Node<T> next;
	private int position;
	
	public Node(T data)
	{
		this.data = data;
	}
	
	public int getPosition() 
	{
		return position;
	}
	public void setPosition(int position)
	{
		this.position = position;
	}
	
	
		public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public Node<T> getNext() 
	{
		return next;
	}
	public void setNext(Node<T> next) 
	{
		this.next = next;
	}
	


}
