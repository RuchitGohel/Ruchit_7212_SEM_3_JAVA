/*
34. Write a java program to use Nested Interface
*/

class OuterClass
{
	interface NestedInterface
	{
		void display();
	}
}

class InnerClass implements OuterClass.NestedInterface
{
	@Override
	public void display()
	{
		System.out.println("Hello from - nested Interface.");
	}	
}
public class NestedInterfaceEx
{
	public static void main(String[] args)
	{
		InnerClass inner = new InnerClass();
		inner.display();
	}
}