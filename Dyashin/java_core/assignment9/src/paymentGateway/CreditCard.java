package paymentGateway;

public class CreditCard extends Payment{
	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using Credit Card, Payment done!");
	}

}
