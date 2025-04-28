package OCT_24.to_string_demo;

public class Product 
{
	int productId;
	String productName;
	public void setProductData(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	} 
	public static void main(String[] args) {
		Product pro = new Product();
		pro.setProductData(1007, "Phone");
		
		System.out.println(pro);
	}
}
