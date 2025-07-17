package DEC_23.exception;
import java.util.*;
public class AbnormalTermination {
	public static void main(String[] args) {
		
		System.out.println("Main method Started!!!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of X: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the Value of y: ");
		int y = sc.nextInt();
		
		int result = x/y;
		System.out.println("Result is "+result);
		
		System.out.println("Main method Completed!!!");
		sc.close();
	}
}
