/*
13-09-2024
23. Write a program to implement multiple catch
*/

class Program_23
{
	public static void main(String[] args)
	{
		try
		{
			int x=10;
			int y=0;
			int z=x/y;
			System.out.println("Answer is:" + z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("You are using 0 as demoninator.");
		}
	}	
}