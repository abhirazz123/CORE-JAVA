package Dec_13.lambda.basic_concepts;



class Accept<T>{
	private T data ;
	public Accept( T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}
public class TypeParameter {
	public static void main(String[] args) {
		Accept <Integer> acceptInt = new Accept<Integer>(12);
		System.out.println("Integer type is " +acceptInt.getData());

		Accept<Double> AcceptDouble = new Accept<Double>(120.2);
		System.out.println("Double type is : "+AcceptDouble.getData());

		Accept <Boolean> AcceptBoolean = new Accept<Boolean>(false);
		System.out.println("Boolean type is " +AcceptBoolean.getData());
		Accept <product> Acceptproduct = new Accept<product>(new product(111));
		System.out.println("Product ID is : "+Acceptproduct.getData());

	}
}
class product {
	private int ProductID;
	public product(int ProductID) {
		this.ProductID = ProductID;
	}
	public String toString() {
		return "Product["+ProductID+"]";
		
	}
}
