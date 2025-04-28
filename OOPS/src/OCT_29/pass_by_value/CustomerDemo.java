package OCT_29.pass_by_value;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println("Before Update:"+c1.getCustomerBill());
		accept(c1);
		
		System.out.println("After Update: "+c1.getCustomerBill());
	}

	private static void accept(Customer cust) {
		cust.setCustomerBill(1800);
		
	}

} 
