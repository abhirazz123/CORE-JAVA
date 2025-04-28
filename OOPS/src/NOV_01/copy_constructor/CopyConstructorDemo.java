package NOV_01.copy_constructor;

public class CopyConstructorDemo {
	public static void main(String[] args) {
		Product prod = new Product(1007,"HP Laptop");
		Product p1 = new Product(prod);
		System.out.println(prod);
		System.out.println(p1);
	}
	
	

}
