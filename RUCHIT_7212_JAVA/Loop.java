/*
Program-6: Write a program to print users name 10 times using loop
*/

import java.util.Scanner;

class Loop
{
 public static void main(String args[])
	{
	 	Scanner scanner = new Scanner(System.in);

	 	System.out.println("Your name:");
	 	String name = scanner.nextLine();

	 	for(int i=0;i<=10;i++)
	 	{
	  	   System.out.println(name);
	 	}  
	  	   scanner.close();
	}
}