/*
overloading
*/

class Calculation2
{
	void sum(int a, int b)
	{
		System.out.println(a+b);	
	}
	void sum(float a, float b, float c)
	{
		System.out.println(a+b+c);
	}
public static void main(String args[])
{
	Calculation2 obj = new Calculation2();
	obj.sum(10.6,20.0,30.5);
	obj.sum(20,50);
}
}