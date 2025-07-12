package NOV_26;
import java.util.Scanner;
class Order {
	private String orderId;
	private String productName;

	public Order(String orderId, String productName) {
		this.orderId = orderId;
		this.productName = productName;
	}
	public String getOrderId() {
		return orderId;

	}
	public String getProductName() {
		return productName;

	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}

}
class Customer {
	private String name;
	private String email;
	private Order order;

	public Customer(String name, String email, Order order) {
		this.name = name;
		this.email = email;
		this.order = order;

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}


}
public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter quantity (numeric)");
		int quantity = sc.nextInt();
		sc.nextLine();

		if(quantity<0) {
			System.out.println("Error Invalid input");
		}

		Order or = new Order("123456", "Laptop");
		Customer cust = new Customer("Abhi", "abhishekrazz323@gmail.com", or);
		System.out.println(cust);


	}

}
