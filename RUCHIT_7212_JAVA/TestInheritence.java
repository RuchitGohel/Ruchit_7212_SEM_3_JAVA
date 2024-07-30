/*
13. Write a java program to show single inheritence using company class(as a sub-class employeeno)
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

class TestInheritence
{
	public static void main(String args[])
	{
		NoOfEmp E = new NoOfEmp();
		E.NoOfEmp();
		E.CmpNm();
	}
}