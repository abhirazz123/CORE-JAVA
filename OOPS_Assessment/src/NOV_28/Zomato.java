package NOV_28;

public class Zomato {
	public static void main(String[] args) {
		Order order = new Order(101, "Paneer Butter Masala", 299.50);
        Customer cust = new Customer(1, "Abhishek Kumar", "Patna, Bihar", order);
		System.out.println(cust);
		
		
	}

}
