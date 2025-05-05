package NOV_20_method_area;
class Customer{
	
}
public class ApplicationClassLoaderDemo {
	public static void main(String[] args) {
		System.out.println("Customer.class file will be loaded by :");
		System.out.println(Customer.class.getClassLoader());
		
	}

}
