package com.bridgelabs.FunctionalProgram;

public class WindChill {
	
	public static double CalcWindChill(double t , double v)
	{
		double V = Math.pow(v,0.16);
		double w = 35.74 + (0.6215*t) + ((0.4275*t - 35.75)*V);
		return w;
	}
	
	public static void main(String[] args)
	{
		double temp = 0 ;
		double vel=0;
		if(args.length>0)
		{
			temp = Double.parseDouble(args[0]);
			vel = Double.parseDouble(args[1]);
		}
		
		System.out.println("Thw WindChill  = "+CalcWindChill(temp,vel));
	}

}
