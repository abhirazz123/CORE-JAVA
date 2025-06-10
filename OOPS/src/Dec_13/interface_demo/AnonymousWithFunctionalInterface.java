package Dec_13.interface_demo;
@FunctionalInterface
interface Payment{
	void makePayment();
}
public class AnonymousWithFunctionalInterface {
	public static void main(String[] args) {
		Payment creditCard = new Payment() {
			@Override
			public void makePayment() {
				System.out.println("Making payment through Debit Card");
			}
		};
		creditCard.makePayment();
	}
}
