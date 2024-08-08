/*
Program - 4 :Write a program to perform arithmetic operations (Using command lines)
*/

public class Math
{
 public static void main(String[] args)
	{
	 int a = Integer.parseInt(args[0]);
	 int b = Integer.parseInt(args[1]);
	
 	 int sum = a + b;
	 int sub = a - b;
	 int mul = a * b;
	 int div = a / b;
	 int mod = a % b;

	 System.out.println( a + "+" + b + "=" + sum);
	 System.out.println( a + "-" + b + "=" + sub);
	 System.out.println( a + "*" + b + "=" + mul);
	 System.out.println( a + "/" + b + "=" + div);
	 System.out.println( a + "%" + b + "=" + mod);		
	}
}