package bankAccount;

public abstract class BankAccount {
	long accountNumber;
	double balance;
	
	public BankAccount(long accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public abstract void calculateInterest();
	
	public void deposit(double depositAmount) {
		balance+=depositAmount;
		System.out.println("Current Balance after deposit: "+balance);
	}
	public void withdraw(double withdrawAmount) {
		balance-=withdrawAmount;
		System.out.println("Current Balance after withdraw: "+balance);
	}
}
