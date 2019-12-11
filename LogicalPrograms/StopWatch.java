package com.bridgelabs.LogicalPrograms;

public class StopWatch {

	private long startWatch;
	private long stopWatch;
	private boolean running;
	
	public  void start()
	{
		startWatch = System.currentTimeMillis();
		running = true;
	}
	
	public  void stop()
	{
		stopWatch = System.currentTimeMillis();
		running = false;
	}
	
	public long GetElapsed()
	{
		
	long elapsed = 0;
		if(running)
			elapsed = System.currentTimeMillis()-startWatch;
		else
			elapsed = stopWatch - startWatch;
		return elapsed;
			
	}
	
 public static void main(String[] args)
 {
	 try {
	 StopWatch s = new StopWatch();
	 s.start();
	 
	 //to check the time ellapsed 
	  Thread.sleep(1450);
	  
	 s.stop();
	 System.out.println("Time elapsed = "+(1.0*s.GetElapsed())/1000+"s");
 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
}
}