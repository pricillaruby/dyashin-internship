package paymentGateway;

public class CreditCardPayment implements PaymentGateway{
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using Credit Card, Payment done!");
	}

}
