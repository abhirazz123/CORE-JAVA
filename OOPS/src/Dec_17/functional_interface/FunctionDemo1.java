package Dec_17.functional_interface;
import java.util.*;
import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		//Finding the cube of a number
		Function<Integer, Integer> fn1 = num->num*num*num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		System.out.println("Cube of "+num+" is "+fn1.apply(num));
		sc.close();
				
	}

}
