package com.bridgelabs.DataStructutres.Stack;

import com.bridgelabs.util.utilclass;

public class BalancedPrentheses 
{
	public static boolean isBalanced(String expression)
	{
		char[] ch = expression.toCharArray();
		ArrayStack<Character> stack = new ArrayStack<Character>();
		
		for(char c :ch)
		{
			if(c == '(')
				stack.push(c);
			if(c == ')')
				stack.pop();
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a Balance Expression to check stack operation");
		String expression = utilclass.InputString();
		if(isBalanced(expression))
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is not balance");
	}

}
