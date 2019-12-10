package com.bridgelabs.basics;


public class TesterClass {

	public static void main(String[] args)
	{
		try
		{	
/*
	int check = util.NumberOfDigits(2345678);
	System.out.println(check);
	LeapYear ly = new LeapYear();
	ly.setYear(1997);
	System.out.println(ly.IsLeapYear());
		
		PowerOf2 p2 = new PowerOf2();
		p2.setN(4);
		p2.PrintPowerOf2();
		
		Harmonic h = new Harmonic();
				h.setN();
				h.PrintHarmonics();
				*/
			
			PrimeFactors pf = new PrimeFactors();
			pf.PrintPrimeFactor();
		}
		catch(Exception e)
		{
			System.out.println("number should be in the range 0 to 31");
			e.printStackTrace();
		}
}
}
