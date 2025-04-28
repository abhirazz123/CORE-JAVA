package OCT_29.pass_by_value;

public class Customer2 {
	private double CustomerBill =1200;
	
	public double getCustomer() {
		return CustomerBill;
		
	}
	public void setCustomerBill(double CustomerBill) {
		this.CustomerBill = CustomerBill;
	}
	public static void main(String[] args) {
		Customer2 c1 = new Customer2();
		
		accept(c1);
		System.out.println(c1.getCustomer());
	}
	private static void accept(Customer2 cust) {
		cust.setCustomerBill(18000);
		
	}

}
