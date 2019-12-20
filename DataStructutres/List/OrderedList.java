package com.bridgelabs.DataStructutres.List;

public class OrderedList<T extends Comparable<T>> 
{
	private Node<T> head;
	private Node<T> last;
	private int size;
	
	
	@Override
	public String toString() 
	{
		String s = "";
		Node<T> temp = head;
		while(temp != null)
		{
			if(temp.getNext()!=null)
				s = s+temp.getData()+",";
			else
				s = s+temp.getData();
			temp = temp.getNext();
		}
		return "["+s+"]";
	}
	
	//To add an element to OrderedList
	public  void add(T data)
	{
		Node<T> n = new Node<T>(data);
		if(head == null && last == null)
		{
			head = last = n;
		}
		else if(head.getData().compareTo(data)>=0)
		{
			Node<T> temp = head;
			head = n;
			n.setNext(temp);
		}
		else
		{
			Node<T> temp = head;
			while(temp.getNext()!=null && temp.getNext().getData().compareTo(data)<0)
			{
				temp = temp.getNext();
			}
			
			if(temp.getNext()==null)
			{
				last.setNext(n);
				last = n;
			}
			else
			{
				Node<T> prev = temp.getNext();
				temp.setNext(n);
				n.setNext(prev);
			}
		}
	}
	
//To calculate the size	
public int size()
{
	Node<T> temp = head;
	while(temp!=null)
	{
		size++;
		temp = temp.getNext();
	}
	return size;
}

//To remove and return last item from list
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

//To check whether list is empty or not
public boolean isEmpty()
{
	if(head == null && last == null)
		return true;
	return false;
}

//To search an item in a list
public boolean search(T data)
{
	Node<T> temp = head;
	while(temp!=null)
	{
		if(temp.getData().compareTo(data)==0)
			return true;
		temp = temp.getNext();
	}
	return false;
	
}

//To remove and return last item in list
public T pop()
{
		T data = null;
		Node<T> temp = head;
		while(temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		data = temp.getData();
		last = temp;
		last.setNext(null);
		return data;
		
	
}
	
}
