/*
15. Write a java program to show hierarchical inheritence.
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
	void NOfEmp()
	{
		System.out.println("Number of employee: 3000");
	}
}

class AvgSal extends Company
{
	void AvgSal()	
	{
		System.out.println("Average salary is: 50,000");
	}
}
class HierArchical
{
	public static void main(String args[])
	{
		NoOfEmp NE = new NoOfEmp();
		NE.CmpNm();
		NE.NOfEmp();
		
		AvgSal AS = new AvgSal();
		AS.CmpNm();
		AS.AvgSal();		
	}
}