package NOV_01.copy_constructor;

public class Product {
	private int ProductId;
	private String ProductName;
	
	public Product(int ProductId, String ProductName) {
		this.ProductId = ProductId;
		this.ProductName = ProductName;
	}
	public Product (Product  p) //p = prod
	{
		this.ProductId = p.ProductId;
		this.ProductName = p.ProductName;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + "]";
	}
	

}
