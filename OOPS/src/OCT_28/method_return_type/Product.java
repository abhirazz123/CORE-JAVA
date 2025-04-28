package OCT_28.method_return_type;

public class Product {
	private int ProductId;
	private String Productname;
	private double ProductPrice;
	
	public Product (int ProductId, String Productname, double ProductPrice) {
		this.ProductId = ProductId;
		this.Productname = Productname;
		this.ProductPrice = ProductPrice;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", Productname=" + Productname + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	public static Product  getProductObject() {
		return new Product(1007, "Laptop", 92000.0);
	}

}
