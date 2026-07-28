package paymentGateway;

public class WalletPayment implements PaymentGateway{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount: "+amount+"\n"+"Using Wallet, Payment done!");
	}

}
