/*
26/9/2024
28. Write a java program to implement custom exception
*/

class InsBalException extends Exception
{
	public InsBalException(String message)
	{
		super(message);
	}
}

public class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}
}
public void withdraw(double amount)throws InsBalException
{
	if(amount>balance)
	{
		throw new InsBalException("Insufficient balance in account.");	
	}
}
	balance-=amount;
	System.out.println("Withdrawl successful.\nRemaining balance."+balance);
