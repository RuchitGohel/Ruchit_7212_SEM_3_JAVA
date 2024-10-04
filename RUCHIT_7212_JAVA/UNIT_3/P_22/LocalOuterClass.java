/*
04-09-24
33 	Write a java program to use Local Inner Class
*/

public class LocalOuterClass
{
	public void method()
	{
	final int outerVariable=10;
	class LocalInnerClass{
	
		private int innerVariable=20;
		public void printVariables()
		{
			System.out.println("Outer variable:"+outerVariable);
			System.out.println("Inner variable:"+innerVariable);
		}
	}
		LocalInnerClass innerObject = new LocalInnerClass();
		innerObject.printVariables();
}

		
	public static void main(String[] args)
	{
		LocalOuterClass outerObject = new LocalOuterClass();

		outerObject.method();
	}
}