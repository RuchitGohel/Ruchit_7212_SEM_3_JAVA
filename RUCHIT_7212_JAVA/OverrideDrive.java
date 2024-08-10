/*
Write a java program to create a class called vehicle with a method called drive().
create a subclass called Car that overrides the drive() method to print 'Repairing a car'
*/

class vehicle
{
	void drive()
	{
		System.out.println("Car needs repairing.");
	}
}
class Car
{
	void drive()
	{
		System.out.println("Repairing a car.");
	}
}

public class OverrideDrive
{
	public static void main(String args[])
	{
		vehicle rep = new vehicle();
		rep.drive();
		rep.drive();
	}
}