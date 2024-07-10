/*
Program - 8 : Write a java program to find odd or even number using command line prompt
*/

class OddEven
{
 public static void main(String args[])
	{
         int a = Integer.parseInt(args[0]);

	 if(a % 2 == 0)
	 {
           System.out.println("The number "+a+" is even number.");
         }
	 else
	 {
           System.out.println("The number" + a + "is odd number."); 
	 }
	}
}