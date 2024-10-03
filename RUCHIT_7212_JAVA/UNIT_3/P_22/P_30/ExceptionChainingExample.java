/*
30. Write a java program to implement Exception Chaining
*/

public class ExceptionChainingExample
{
	public static void main(String[] args)
	{
		try
		{
			method1();
		}
		catch(Exception e)
		{
			//print the original exception and the chain of exceptions
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception
	{
		try
		{
			method2();
		}
		catch(ArithmeticException e)
		{
			/*chaining the exception:throwing a new exception with
			the original one as the cause*/
			throw new Exception("Exception in method1",e);
		}
	}
	public static void method2()
	{
		//this will cause an arithmeticexception 
		int result=10/0;
	}
}