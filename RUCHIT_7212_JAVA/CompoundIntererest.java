import java.util.Scanner;

class CompoundInterest
{
	public static void main(String args[])
	{
		int r=5, n=3;
		float CI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of years:");
		int Year = sc.nextInt();
		
		System.out.println("Enter principle amount:");
		int Principle = sc.nextInt();

		CI = Principle ( 1 + r / 12 ) ^ n * Year;

		System.out.println("Compound interest comes to:" + CI);
		sc.close();
	}
}