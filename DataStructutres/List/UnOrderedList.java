package com.bridgelabs.DataStructutres.List;

public class UnOrderedList<T> 
{
	private Node<T> head;
	private Node<T> last;
	private int size;
	
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
	
	public <T extends Comparable<T>> boolean remove(T data)
	{
		Node temp = head;
		while(temp.getNext()!=null)
		{
			if(temp.getData().
		}
	}

}
