package paymentGateway;

public class UPIPayment implements PaymentGateway{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using UPI, Payment done!");
	}



}
