package assignment4;

public class Account {
	long accountNumber;
	String holderName;
	double balance;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account();
		account1.accountNumber = 244724270;
		account1.holderName = "Pricilla";
		account1.balance = 36829;
		
		Account account2 = new Account();
		account2.accountNumber = 153873890;
		account2.holderName = "Ruby";
		account2.balance = 282384;
		
		System.out.println("Account1: "+account1.accountNumber+" , "+"Holder Name: "+account1.holderName+" , "+"Balance: "+account1.balance+"\n"
		+"Account2: "+account2.accountNumber+" , "+"Holder Name: "+account2.holderName+" , "+"Balance: "+account2.balance);
	}

}
