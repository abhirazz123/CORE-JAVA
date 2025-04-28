package OCT_29.deep_copy;

public class Product 
{
	private int productId;
	private String productName;

	public Product()
	{
		productId = 0;
		productName = null;
	}

	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}	
}
