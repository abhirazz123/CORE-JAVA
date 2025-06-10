package Dec_13.lambda.basic_concepts;
import java.util.Scanner;
@FunctionalInterface
interface Calculate{
	double Dosum(double x, double y ) ;
}
public class LambdaDemo2 {
	public static void main(String[] args) {
		Calculate c = (a,b)->a+b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a :");
		double p = sc.nextDouble();
		System.out.print("Enter the value of b ");
		double q = sc.nextDouble();
		System.out.println("Sum is : "+c.Dosum(p, q));
	}
}
