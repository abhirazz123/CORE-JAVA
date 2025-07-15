package Dec_18.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

class Product{
	private Integer ProductId;
	private String ProductName;
	private Double ProductPrice;
	
	public Product(Integer ProductId, String ProductName, Double ProductPrice) {
		this.ProductId = ProductId;
		this.ProductName = ProductName;
		this.ProductPrice = ProductPrice;
		
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	
}
public class SupplierDemo3 {
	public static void main(String[] args) {
		Supplier<Product> prd = ()->{
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter  Product Id: ");
			int id = sc.nextInt();
			
			System.out.print("Enter Product Name: ");
			String name = sc.next();
			
			System.out.print("Enter Product Price: ");
			double price = sc.nextDouble();
			
			return new Product(id, name, price);
			
		};
		System.out.println(prd.get());
	}
}
