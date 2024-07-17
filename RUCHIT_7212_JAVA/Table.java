/*
Write a program to print table of any user given number.
*/

import java.util.Scanner;

class table
{
	public static void main(String[] args)
	{	
		int table;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to get its table:");
		int number =  sc.nextInt();

		for(int i=1; i<=10; i++)
		{
			table = number * i;
			System.out.println(number + " " + "*" + " " + i + "=" + " " + table);
		}
	sc.close();
	}
}