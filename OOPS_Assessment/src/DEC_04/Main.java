package DEC_04;

class Payment{
	public void processPayment() {
		System.out.println("Processing payment");
	}
}
class CreditCardPayment extends Payment  {
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
	
}
class PayPalPayment extends Payment{
	public void	processPayment() {
		System.out.println("Processing PayPal payment");
	}
}
class BankTransferPayment extends Payment {
	public void processPayment() {
		System.out.println("Processing bank transfer payment");
	}
}
class PaymentProcessor{
	public  static void processMultiplePayments(Payment... payments ) {
		for(Payment p : payments) {
			p.processPayment();
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Payment p1 = new Payment();
        Payment p2 = new CreditCardPayment();
        Payment p3 = new PayPalPayment();
        Payment p4 = new BankTransferPayment();
        
        PaymentProcessor.processMultiplePayments(p1,p2,p3,p4);
        
	}

}
