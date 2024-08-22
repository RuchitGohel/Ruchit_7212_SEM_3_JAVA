/*
Write a program in java that having 4 packages named addition,subtraction, multiplication and division.
all packages having a program with name add, sub, mul and div classes
class add have calAdd() and dispAdd() from main class user have to give two values and it show all maths calculations
*/

package Addition;

public class Add
{
	int sum;
	public void add(int x, int y)
	{
		sum = x + y;
	}
	public void dispadd()
	{
		System.out.println("Addition is:" + sum);
	}
}