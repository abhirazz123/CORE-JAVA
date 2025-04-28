package OCT_29.HEAP_and_STACK;

public class CustomerDemo {
	public static void main(String[] args) {
		int val =100;
		
		Customer c = new Customer("Abhi", 2);
		m1(c);
		System.out.println(c.getId());
	}

	private static void m1(Customer cust) {
		cust.setId(1007);
		
		cust = new Customer("Razz", 1107);
		System.out.println(cust.getId());
		
	}
}
