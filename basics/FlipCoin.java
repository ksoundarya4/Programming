package com.bridgelabs.basics;

import com.bridgelabs.util.utilclass;

public class FlipCoin {
	public  double ToFlipCoin()
	{
		System.out.println("Enter number of times to Flip a Coin");
		int N = utilclass.InputInteger();
		int T = 0;
		int H = 0;
		
		for(int i = 0; i<N; i++)
		{
			double d = Math.random();
			if(d<=0.5)
				T++;
			else
			H++;
		}
		
		 double res = (H/T);
		 return res;
	}

}
