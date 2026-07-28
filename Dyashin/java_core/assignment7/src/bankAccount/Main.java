package bankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingsAcc = new SavingsAccount(126310129,10000);
		savingsAcc.deposit(2500);
		savingsAcc.withdraw(3500);
		savingsAcc.calculateInterest();
		
		BankAccount currentAcc = new CurrentAccount(23691834,25000);
		currentAcc.calculateInterest();
	}

}
