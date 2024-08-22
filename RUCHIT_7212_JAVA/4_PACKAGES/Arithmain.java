import java.util.Scanner;
import Addition.Add;
import Subtraction.Sub;
import Multiplication.Mul;
import Division.Div;

public class Arithmain
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x = scn.nextInt();		
		System.out.println("Enter 2nd number");
		int y = scn.nextInt();

		Add A = new Add();
		A.add(x,y);
		A.dispadd();
		
		Sub S = new Sub();
		S.sub(x,y);
		S.dispsub();
		
		Mul M = new Mul();
		M.mul(x,y);
		M.dispmul();
		
		Div D = new Div();
		D.div(x,y);
		D.dispdiv();

		scn.close();
	}
}
	