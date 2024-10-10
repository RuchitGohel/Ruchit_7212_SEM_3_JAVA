/*
40.  Write a java program to create a thread using Runnable Class
*/

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("This code is running in a thread");
	}
	public static void main(String args[])
	{
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("This code is outside of a thread.");
	}
}