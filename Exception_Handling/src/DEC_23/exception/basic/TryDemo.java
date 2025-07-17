package DEC_23.exception.basic;

import java.util.Scanner;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("Main method starded...");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the value of x: ");
			int x = sc.nextInt();
			
			System.out.println("Enter the value of y: ");
			int y = sc.nextInt();
			
			int result = x/y;
			System.out.println("Result is : "+result);
			System.out.println("End of try block");
			
		} catch (Exception e) {
			System.out.println("Inside Catch Block");
			System.out.println(e);
		}
		System.out.println("Main method completd....");
	}

}
