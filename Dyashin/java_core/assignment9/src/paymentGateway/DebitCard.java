package paymentGateway;

public class DebitCard extends Payment{

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using Debit Card, Payment done!");
	}

}
