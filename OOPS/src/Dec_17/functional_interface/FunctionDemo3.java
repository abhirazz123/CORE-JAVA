package Dec_17.functional_interface;
import java.util.*;
import java.util.function.Function;

public class FunctionDemo3 {
	public static void main(String[] args) {
		// Verify whether my name starts with character A or not
		
		Function<String, Boolean> fn3 = str->str.startsWith("A");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Your Name: ");
		String name = sc.next();
		System.out.println("Name is Starts with A "+fn3.apply(name));
	}

}
