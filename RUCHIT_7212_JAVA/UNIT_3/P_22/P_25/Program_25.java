/*
13-09-2024
25. Write a program to implement multiple catch
*/

class Program_25
{
	public static void main(String[] args)
	{
		try
		{
			int x=10;
			int y=0;
			int z=x/y;
			System.out.println("Answer is:" + z);

			int a[]={10,20};
			System.out.println("Value is:" + a[2]);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("You are using 0 as demoninator.");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			System.out.println("Invalid index value.");
		}

	}
	
}