/*
39.  Write a java program to create a thread using Thread Class
*/

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("This code is running in a thread");
	}
	public static void main(String args[])
	{
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("This code is outside of a thread.");
	}
}