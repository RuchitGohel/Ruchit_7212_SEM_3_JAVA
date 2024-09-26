/*
26/9/2024
28. Write a java program to implement custom exception
*/

//define a custom exception class

class InsBalException extends Exception
{
	public InsBalException(String message)
	{
		super(message);
	}
}

//define a class that uses the custom exception

public class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
	public void withdraw(double amount) throws InsBalException
	{
		if(amount>balance)
		{
		throw new InsBalException("Insufficient balance in account.");	
		}

		balance-=amount;
		System.out.println("Withdrawl successful.\nRemaining balance."+balance);
	}

	public static void main(String[] args)
	{	
		BankAccount account=new BankAccount(1000.00);
		try
		{
		account.withdraw(500.00);
		account.withdraw(600.00);
		}catch(InsBalException e){
		System.out.println("Error:"+e.getMessage());
		}
	}
}