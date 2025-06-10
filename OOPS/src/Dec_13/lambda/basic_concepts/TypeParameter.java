package Dec_13.lambda.basic_concepts;
class Accept<T>{
	private T data;
	public Accept(T data) {//product data 
		super();
		this.data =data;
	}
	public T getData() {
		return data;
	}
}
public class TypeParameter {
	public static void main(String[] args) {
		Accept<Integer> acceptInt = new Accept<Integer>(12);
		System.out.println("Integer type is : "+acceptInt.getData());
		
		Accept<Double> acceptDouble = new Accept<Double>(95.12);
		System.out.println("Double type is : "+acceptDouble.getData());
		
		Accept<Boolean> acceptBoolean = new Accept<Boolean>(false);
		System.out.println("Boolean type is : "+acceptBoolean.getData());
		
		Accept<Product> acceptProduct = new Accept<Product>(new Product(111));
		System.out.println("Product Type is : "+acceptProduct.getData());
		}

}
class Product{
	private int ProductId;
	public Product(int ProductId) {
		this.ProductId = ProductId;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + "]";
	}
	
	
}