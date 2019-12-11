package com.bridgelabs.LogicalPrograms;

public class Gambler {
	
	public static void main(String[] args)
	{
		//Accept input of $stack,$goal and number of trails via command line arguments.
		int stack = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trails = Integer.parseInt(args[2]);
		
		//Initialize number of wins and bets to Zeo
		
		int wins = 0;
		int bets = 0;
		
		for(int i = 0; i<trails; i++)
		{
			int cash = stack;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
				wins++;
		}
		
		System.out.println("Number of wins = "+wins);
		System.out.println("Percentage of wins = "+(100.0*wins)/trails);
		System.out.println("Average of bets = "+(1.0*bets)/trails);
	}
	

}
