/*
date - 13-09-2024
22. Write a java program to implement simple exception handling
*/

class Program_22
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
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("You are using 0 as demoninator.");
		}
	}
	
}