package com.customException;

public class Example2 {
	public void deposit(double amount) {
		if(amount<=0) {
			throw new InvaliddepositAmount("invalid amount");
		}
		System.out.println("Deposited: "+amount);
	}
	public static void main(String args[]) {
		Example2 bank = new Example2();
		bank.deposit(200);
		bank.deposit(0);
		bank.deposit(-29);
	}
}
