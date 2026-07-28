package paymentGateway;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment creditCard = new CreditCard();
		Payment upi = new UPI();
		Payment debitcard = new DebitCard();
		
		creditCard.makePayment(500);
		upi.makePayment(5000);
		debitcard.makePayment(500);

	}

}
