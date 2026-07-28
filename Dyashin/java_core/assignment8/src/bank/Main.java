package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		bank.setAccountNumber(274836847);
		bank.setAccountHolderName("Pricilla");
		bank.setBalance(10000);
		System.out.println(bank.getAccountNumber()+" "+bank.getAccountHolderName()+" "+bank.getBalance());
		bank.depositMoney(5000);  
		System.out.println("After Deposit money: "+bank.getBalance());
		bank.withdrawMoney(2000);
		System.out.println("After Withdraw Money: "+bank.getBalance());
	}

}
