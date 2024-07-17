/*
Program-9 : Write a program to find out students result/grade using IF condition
*/

import java.util.Scanner;

class Grade
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
         System.out.println("\nEnter your percentage:\n");
	 int perc = sc.nextInt();

         if(perc<35)
		{
		 System.out.println("\nYou failed:\n");
		}
	else{
		System.out.println("\nYou passed the exam:");
		}		
	sc.close();
	}	
}