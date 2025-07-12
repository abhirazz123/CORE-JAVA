package Dec_17.functional_interface;

import java.util.function.Consumer;


public class ConsumerDemo1 {
	public static void main(String[] args) {
		Consumer<Integer> c1 = num -> System.out.println("Integer type : "+num);
		c1.accept(12);
		
		Consumer< Boolean> c2 = bool-> System.out.println("Boolean Tupe : "+bool);
		c2.accept(false);
		
		Consumer <Customer> c3 = cust->System.out.println("Customer Type "+cust);
		c3.accept(new Customer(1111));
	}

}
class Customer{
	private int CustomerID;
	public  Customer(int CustomerID) {
		this.CustomerID = CustomerID;
	}
	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + "]";
	}
	
}
