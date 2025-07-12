package Dec_17.functional_interface;
import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = num->num%2==0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		System.out.println("Is "+num+" Even number ? "+p1.test(num));
	}
}
