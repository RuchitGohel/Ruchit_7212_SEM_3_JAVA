/*
	20-09-2024
 	26. Write a java program to use Throw Keyword
*/

public class ThrowKey
{
	public static void main(String[] args)
	{
		try
		{
			divide(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Message is:"+e.getMessage());
		}
	}
	public static int divide(int a ,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("Cannot divide by zero!");
		}
		return a/b;
	}
}