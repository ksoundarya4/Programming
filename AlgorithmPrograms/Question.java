package com.bridgelabs.AlgorithmPrograms;

import com.bridgelabs.util.utilclass;

public class Question
{
 public static int search(int l ,int h)
 {
	 if(h-l==1)
		 return l;
	 
	 int mid = l + (h-l)/2;
	 System.out.println("is your number less than "+mid);
	boolean b = utilclass.InputBoolean();
	 if(b)
		return search(l,mid);
	 else
		return search(mid,h);
 }
 
 public static void main(String[] args)
 {
	
	 int a = Integer.parseInt(args[0]);
	 int N = (int)Math.pow(2, a);
	 System.out.println("Think of any number between 0 to "+N);
	 int secret = search(0,N);
	 System.out.println("The number is "+secret);
	 
 }
}
