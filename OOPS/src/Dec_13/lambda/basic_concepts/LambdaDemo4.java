package Dec_13.lambda.basic_concepts;
import java.util.Scanner;
@FunctionalInterface
interface Verifier{
	boolean Verify(Integer num);
}
public class LambdaDemo4 {
	public static void main(String[] args) {
		//Check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int no = sc.nextInt();
		Verifier v = num->
		{
			return num % 2 == 0;
		};
		System.out.println("Is " +no+ " Number " +v.Verify(no));
	}
}
