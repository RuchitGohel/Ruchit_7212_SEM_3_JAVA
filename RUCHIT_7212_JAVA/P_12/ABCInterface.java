/*
P_12 - Write a java program to exetend one interface to another.
*/

interface A
{
	void methodA();
}
interface B extends A
{
	void methodB();
}

class C implements B
{
	public void methodA(){
		System.out.println("Method A");
	}
	public void methodB(){
		System.out.println("Method B");
	}
}
public class ABCInterface{
	public static void main(String[] args)
	{
		C c = new C();
		c.methodA();
		c.methodB();
	}
}
