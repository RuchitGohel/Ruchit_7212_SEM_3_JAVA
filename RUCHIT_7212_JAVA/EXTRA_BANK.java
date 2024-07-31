/*
Write a java program to create a class bank account with method called deposit and withdraw,
create a subclass called saving accounts that shows the account balance and bank account number
and user's name.Create an object of the bank account, saving account and call deposit and withdraw
methods
*/

class BankAccount
{
	void Deposit()
	{
		int deposit = 50000;
		System.out.println("Deposited amount is:" + " " + deposit);
		
		System.out.println("Updated balance is :550000");
		
	}
	void withdraw()
	{
		int withdraw = 100000;	
		System.out.println("Withdrawal amount is:" + " " + withdraw);
		
		System.out.println("Updated balance is: 450000");
	}
}

class SavingAccount extends BankAccount{
	void AccountBal()
	{
		int Bal = 500000;
		System.out.println("Account balance is :" + " " + Bal);
	}
	void AccountNumber()
	{
		int AC = 9230;
		System.out.println("Account number is : " + " " + AC);
	}
	void UserName()
	{
		System.out.println("User name is John Doe");
	}
}

class BankAcc
{
	public static void main(String args[])
	{
		SavingAccount U = new SavingAccount();
		
		U.UserName();
		U.AccountNumber();
		U.AccountBal();
		U.Deposit();
		U.withdraw();
	
	}
}