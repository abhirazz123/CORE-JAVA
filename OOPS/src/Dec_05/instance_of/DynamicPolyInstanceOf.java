package Dec_05.instance_of;

import java.util.*;

class Payment {
	public double makePayment(double amount) {
		return amount;
	}
}
class UPI extends Payment{
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a Payment of "+amount+ " through UPI");
		return amount;
	}
	public void offer() {
		System.out.println("Make fist Payment and get 100 RS");
	}
}
class CreditCard extends Payment{
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a payment of " +amount + " through Credit Card ");
		return amount;
	}
	public void offer() {
		System.out.println("Making first Payment and gat a haliday ticket ");
	}
}

public class DynamicPolyInstanceOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.UPI");
		System.out.println("2.Credit Card");
		System.out.println("===============");
		int choice = sc.nextInt();

		System.out.print("Enter the Payment amount: ");
		double amount = sc.nextDouble();

		Payment payment  = null;

		if(choice == 1) {
			payment = new UPI();
		}else if(choice == 2) {
			payment = new CreditCard();
		}else {
			System.err.println("Invalid choice! Exiting...");
			sc.close();
			return;
		}
		acceptPayment(payment, amount);
	}
	public static void acceptPayment (Payment  payment , double amount) {
		if(payment instanceof UPI) {
			UPI u = (UPI) payment;
			u.makePayment(amount);
			u.offer();
		}else if(payment instanceof CreditCard) {
			CreditCard c = (CreditCard) payment;
			c.makePayment(amount);
			c.offer();
		}
	}

}
