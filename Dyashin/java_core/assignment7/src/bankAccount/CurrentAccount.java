package bankAccount;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(long accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	double interest = 0.05;
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		balance+=interest;
		System.out.println("New balance in current account: "+balance);
	}

}
