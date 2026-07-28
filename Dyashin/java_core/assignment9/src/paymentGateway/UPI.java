package paymentGateway;

public class UPI extends Payment{

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using UPI, Payment done!");
	}



}
