package Dec_18.supplier;
import java.util.function.Supplier;

public class SupplierDemo1 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()-> 100+200+" NIT "+80+80;
		System.out.println(s1.get());		
	}
}
