/*
24 Write a java program to use Finally block in Exception Handling
*/

class Program_24
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
		finally
		{
			
			System.out.println("You are using 0 as demoninator.");
		}
	}	
}