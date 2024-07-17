/*
Program-10: Write a program of 1d array.
*/
import java.util.Scanner;

class ArrEx
{
	public static void main(String[] args)
	{
 		//Declare array
		int scores[] = new int[5];

		//manually enter array elements
		scores[0] = 65;
		scores[1] = 75;
		scores[2] = 58;
		scores[3] = 67;
		scores[4] = 86;		

		System.out.println("\nScores are:\n");
		for(int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		Scanner scanner = new Scanner(System.in); 

		System.out.println("\nEnter your score:");
		for(int i=0; i<scores.length; i++)
		{
	  		int number = scanner.nextInt(); 		 
		}
		System.out.println("\nYour scores are:\n");
		for(int i=0; i<scores.length; i++)
		{
			System.out.println(); 		 	
		}
	scanner.close();	
}
	
}