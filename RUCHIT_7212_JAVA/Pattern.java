/*
Print the pattern using for loop.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
import java.util.Scanner;

class Pattern
{
	
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("\nEnter number of columns for pattern:");
	int column = scanner.nextInt();
	System.out.println("\n");
		for(int i=1; i<=column; i++)
		{
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	scanner.close();
	}
}


/*     int num;
     clrscr();
     printf("Enter  a number :");
     scanf("%d", &num);

     for (int i = 1; i <= num; i++){
		 for (int j = 1; j <= i; j++){
		     printf("%d", j);
		 }
		 printf("\n");
     }

    }*/