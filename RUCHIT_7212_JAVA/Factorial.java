/*
Write a program to calculate factorial
*/

import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int factorial=1;
		int temp=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial");
		int fact = sc.nextInt();
		
		while(fact>=1)
		{	
			factorial *= fact * temp;  
			fact--; 		
		}
		System.out.println("The factorial is : " + factorial);
		sc.close();
	}
}