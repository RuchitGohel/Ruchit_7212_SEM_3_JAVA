/*
Overriding
*/

class abc
{
	int x;
	abc(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("Output from base class x= " + x);
	}
}
class xyz extends abc
{
	int y;
	xyz(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Output from derived class x=" +x+ "y="+y);
		super.display();
	}
}
class ex12
{
	public static void main(String argsp[])
	{
		xyz p1=new xyz(100,200);
		p1.display();
	}
}