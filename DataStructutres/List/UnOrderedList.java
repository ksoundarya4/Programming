package com.bridgelabs.DataStructutres.List;


public class UnOrderedList<T extends Comparable<T>>
{
	private Node<T> head;
	private Node<T> last;
	private int size;
	
	
	//Overriding toString method
	@Override
	public  String toString()
	{
		String s = "";
		Node<T> temp = (Node<T>)head;
		while(temp!=null)
		{
			if(temp.getNext()==null)
			s =s + temp.getData();
			else
				s = s + temp.getData() + ",";
			temp = temp.getNext();
		}
		return "["+s+"]";
	}

	//To add data to list
	public void add(T data)
	{
		Node<T> n = new Node<T>(data);
		if(head==null  && last == null)
			head = last = n;
		else
		{
			last.setNext(n);
			last = n;
			n.setPosition(size);
		}
		size++;
	}
	
	//To search for data
	public  boolean Search(T data)
	{
		Node<T> temp = head;
		
		while(temp!=null)
		{
			if(temp.getData().compareTo(data)==0)
				return true;
			
		temp=temp.getNext();
		}
		return false;
	}
	
	//To return the size of list
	public int Size()
	{
		return size;
	}
	
//To remove an element	
public boolean Remove(T data)
{
	Node<T> temp =  head;
	Node<T> prev = null;
	
	if(temp != null && temp.getData().compareTo(data)==0)
	{
		head = temp.getNext();
		size--;
		return true;
	}
	while(temp != null && (temp.getData().compareTo(data)!=0))
			{
		prev = temp;
		temp = temp.getNext();
			}
	if(temp == null)
		return false;
	
	prev.setNext(temp.getNext());
	size--;
	return true;
	
	
}

	//To find if list is Empty
	public boolean isEmpty()
		{
		if(head == null && last == null)
		return true;
		return false;
}
}


