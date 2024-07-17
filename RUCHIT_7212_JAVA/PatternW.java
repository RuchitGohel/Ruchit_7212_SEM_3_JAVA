/*
Print the pattern using for loop.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
import java.util.Scanner;

class PatternW
{
	
	public static void main(String[] args){
	
	int i=1, j=1;
	Scanner scanner = new Scanner(System.in);

	System.out.println("\nEnter number of columns for pattern:");
	int column = scanner.nextInt();
	System.out.println("\n");
		while(i<=column){
			while(j<=i){
				System.out.print(" "+j);
				j++;
				}
			System.out.println(" ");
			i++;
			j=1;
			}
	scanner.close();
	}		
}

























