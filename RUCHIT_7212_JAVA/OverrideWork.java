/*
Write a java program to create a class called Employee with methods called work() and gerSalary()
create a subclass called HRmanager that overrides the work() method and adds a new
method called daddEmployee()
*/

class Employee
{
	void work()
	{
		System.out.println("John works in HR");
	}	
	void getSalary()
	{
		System.out.println("John's salary: 60000");
	}
}

class HRManager
{
	void work()
	{
		System.out.println("John is HR manager.");
	}
	void addEmployee()
	{
		System.out.println("Recruited 50 people.");
	}
}

public class OverrideWork
{
	public static void main(String args[])
	{
		HRManager man = new HRManager();
		man.work();
		man.addEmployee();
	}
}