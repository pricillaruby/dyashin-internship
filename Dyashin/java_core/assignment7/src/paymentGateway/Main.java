package paymentGateway;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Type:");
		System.out.println(" 1.Credit_Card \n 2.UPI \n 3.Wallet");
		String paymentType = sc.next();
		System.out.println("Enter Amount: ");
		double amount = sc.nextDouble();
		
		PaymentGateway creditCard = new CreditCardPayment();
		PaymentGateway upi = new UPIPayment();
		PaymentGateway wallet = new WalletPayment();
		
		switch(paymentType) {
		case "Credit_Card":
			creditCard.processPayment(amount);
			break;
		case "UPI":
			upi.processPayment(amount);
			break;
		case "Wallet":
			wallet.processPayment(amount);
			break;
		default:
			System.out.println("Enter Valid Option");
		}
	}

}
