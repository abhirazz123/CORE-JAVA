package NOV_18;

class Customer1{
	private double bill = 1200;

	public void setBill(double bill) {
		this.bill = bill;
	}
	
	public double getBill(){
		return this.bill;
	}
	
}
public class PassByValueTest {
	public static void main(String[] args) {
	  Customer1 c1 = new Customer1();	
	  
	  updateCustomerBill(c1);
	  System.out.println(c1.getBill());
	}
	
	public static void updateCustomerBill(Customer1 cust){
		cust.setBill(1800);
	}
}
