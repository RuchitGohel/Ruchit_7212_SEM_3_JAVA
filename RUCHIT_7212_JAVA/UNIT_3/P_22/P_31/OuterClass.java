/*
3/10/24
31 - Write a java program to use simple inner class in your program
*/

public class OuterClass
{
	private int outerVariable=10;
	public class InnerClass
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
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.printVariables();
	}
}