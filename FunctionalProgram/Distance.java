package com.bridgelabs.FunctionalProgram;

public class Distance {
	
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		// convert Strig to integer
		if(args.length>0)
		{
			 x = Integer.parseInt(args[0]);
			 y = Integer.parseInt(args[1]);
			}
		double a = (x*x)+(y*y);
		double Edistance = Math.sqrt(a);
		System.out.println("The Euclidian distance ="+Edistance);
	}

}
