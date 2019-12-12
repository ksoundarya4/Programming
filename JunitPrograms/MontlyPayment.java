package com.bridgelabs.JunitPrograms;

import com.bridgelabs.util.utilclass;

public class MontlyPayment {

	public static void main(String[] args) {
		int Principle = 0;
		int Year = 0;
		int Rate = 0;
		
		if(args.length>0)
		{
			Principle = Integer.parseInt(args[0]);
			Year = Integer.parseInt(args[1]);
			Rate = Integer.parseInt(args[2]);
		}
		 System.out.println("The Monthly Payment is = "+utilclass.MontlyPayment(Principle, Year, Rate));
	}

}
