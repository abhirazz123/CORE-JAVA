package NOV_1;
public class Test{
	public static void main(String[] args) {
		int val = 100;
		Customer c = new Customer("Abhi", 2);
		m1(c);
	}
	public static void m1(Customer c) {
		c.setId(5);
		System.out.println(c.getId());	
	}
}
