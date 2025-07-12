package Dec_17.functional_interface;
import java.util.*;
import java.util.function.Function;

public class FunctionDemo2 {
	public static void main(String[] args) {
		//Finding the length of given city
		Function<String , Integer> fn2 = str->str.length();
		Scanner sc = new  Scanner( System.in);
		
		System.out.print("Enter Your city Name: ");
		String city = sc.next();
		
		System.out.println("Lenth of "+city+" is "+fn2.apply(city));
		sc.close();
		
	}

}
