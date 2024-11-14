/*
41. Write a java program to set Thread name and priority & test it.
*/

public class SetGetThread
{
	public static void main(String args[])
	{
		Thread myThread = new Thread(new MyThread());
		myThread.setName("MyThread");
		myThread.setPriority(Thread.MAX_PRIORITY);
		myThread.start();
		
		//main thread

		System.out.println("Main thread name:" + 
					Thread.currentThread().getName());
		System.out.println("Main thread priority: " + 
					Thread.currentThread().getPriority());
	}	
}
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread is runnumg with name:" + 
					Thread.currentThread().getName());
		System.out.println("Thread priority:" + 
					Thread.currentThread().getPriority());
	}
}