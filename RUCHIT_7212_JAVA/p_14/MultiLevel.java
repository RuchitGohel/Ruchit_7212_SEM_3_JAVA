/*
14. Write a java program to show multiple inheritence using company class(as a sub-class employeeno)
*/

class Company
{
	void CmpNm()
	{
		System.out.println("Company name:Oracle Red Bull Racing/");
	}
}

class NoOfEmp extends Company
{
	void NoOfEmp()
	{
		System.out.println("Number of employee: 3000");
	}
}

class AvgSal extends NoOfEmp
{
	void AvgSal()	
	{
		System.out.println("Average salary is: 50,000");
	}
}
class MultiLevel
{
	public static void main(String args[])
	{
		AvgSal A = new AvgSal();
		
		A.CmpNm();
		A.NoOfEmp();
		A.AvgSal();
	}
}