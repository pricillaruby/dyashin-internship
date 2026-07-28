package bankAccount;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(long accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	double interest = 0.05;

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		balance+=interest;
		System.out.println("New balance in savings account: "+balance);
	}
	
}
