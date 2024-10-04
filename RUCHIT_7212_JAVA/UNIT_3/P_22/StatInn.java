/*
04-09-24
32 Write a java program to use Static Inner Class
*/

public class StatInn
{
	private static int outerVariable=10;
	public static class InnerClass
	{
		private int innerVariable=20;
		public void printVariables()
		{
			System.out.println("Outer variable:"+outerVariable);
			System.out.println("Inner variable:"+innerVariable);
		}
	}
	public static void main(String[] args)
	{
		StatInn.InnerClass inner = new StatInn.InnerClass();
		inner.printVariables();
	}
}