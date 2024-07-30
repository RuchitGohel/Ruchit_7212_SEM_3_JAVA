/* write a java program to check if number is palindrome or not */

import java.util.Scanner;

class palindrome
{
	public static void main(String args[])
	{
	   int temp,rev=1;
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Enter a number:");
	   int num = scanner.nextInt();
	   
	   while(num!=0)
	     {
			temp = num % 10;
			rev = (rev*10) + temp;
			num = num / 10;
		 }
	   if (rev == num)
			{
			System.out.println("Number is not palindrome");
			}
		else 
		{
		  System.out.println("Number is palindrome");
		}
	   scanner.close();
	   
	}
}