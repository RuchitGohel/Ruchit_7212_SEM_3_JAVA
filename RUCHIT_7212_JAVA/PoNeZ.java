/*
Program -7: Write a java program to user if elseif ladder to find positive,
negative or zero number.
*/

import java.util.Scanner;

class IfElse
{
	public static void main(String[] args)
	{
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter a number:");
	 int number = scanner.nextInt();
  
	 if(number > 0)
	   {
	    System.out.println("The number" + number + "is positive number.");
           }
         else if(number < 0)
           {
	    System.out.println("The number" + number + "ia negative number.");
	   }
	  else
	   {
	    System.out.println("The number is zero.");
	    }
scanner.close();
	}
	
}