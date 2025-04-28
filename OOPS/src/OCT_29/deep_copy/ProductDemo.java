package OCT_29.deep_copy;

public class ProductDemo 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Laptop");

		Product p2 = new Product();
		p2.setProductId(p1.getProductId());
		p2.setProductName(p1.getProductName());

		System.out.println("Before Modification...");
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("After Modification...");
		p1.setProductId(222);
		p1.setProductName("Camera");
		System.out.println(p1);
		System.out.println(p2);
	}

}
