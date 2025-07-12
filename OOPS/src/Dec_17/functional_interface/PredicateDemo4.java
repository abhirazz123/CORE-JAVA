package Dec_17.functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo4 {
	public static void main(String[] args) {
		//Verify my name is Abhi or not
		Predicate<String > p4 = str->str.equalsIgnoreCase("Abhi");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enete Your Name ");
		String name = sc.next();
		System.err.println("Are you Abhi: "+p4.test(name));
		
	}
}
