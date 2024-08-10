/*
Write a java program that creates a class hierarchy for employees of a company.
The base class should be Employee, with subclasses manager, developer and programmer 
Each subclass should have properties such as name, address, salary and job title.
Implement methods for calculating bonuses, generating performance reports and managing projects
*/

class Employee
{
	void bonuses()
	{
		System.out.println("Manager bonus is : 20000");
		System.out.println("Developer bonus is: 15000");
		System.out.println("programmer bonus is : 10000");
	}	
	void PerformanceReport()
	{
		System.out.println("Manager performance rating: 9");
		System.out.println("Developer performance rating: 8");
		System.out.println("Programmer performance rating: 7");
	}
	void ProjectManagement()
	{
		System.out.println("Manager is overseeing a project.");
		System.out.println("Developer supervises programmer.");
		System.out.println("Programmer reports to developer.");
	}
}
class Manager extends Employee
{
		void name()
		{
		System.out.println("Name of manager: Mani");
		}
		void address()
		{
		System.out.println("Address of manager: Wright st.");
		}	
		void salary()
		{
		System.out.println("Salary of manager: 89999");
		}
}
class Developer extends Manager
{
		void name()
		{
		System.out.println("Developer name: Ryan");	
		}
		void address()
		{
		System.out.println("Address of developer: Church st.");		
		}
		void salary()
		{
		System.out.println("Salary of developer: 75009");
		}
}
class Programmer extends Developer
{
		void name()
		{
		System.out.println("Programmer name: John");
		}
		void addresss(){
		System.out.println("Address of programmer: Wood st.");
		}
		void salary()
		{
		System.out.println("Salary of programmer: 65000");
		}
}
public class Inheritence
{
	public static void main(String args[])
	{
		Developer main = new Developer();
		main.name();	
		main.address();
		main.salary();
		main.bonuses();
		main.PerformanceReport();
		main.ProjectManagement();
	}
}