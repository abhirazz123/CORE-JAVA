package DEC_27.try_with_resourses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		try(sc){
			System.out.print("Enter the Roll number:");
			int rollnum = sc.nextInt();
			System.out.println("Your roll is "+rollnum);
		}
		catch (InputMismatchException e) {
			System.out.println("Provide Vaild Input");
			try {
				System.out.println(10/0);
			} catch (ArithmeticException e2) {
				System.out.println("Divide by zero problem");
			}
		}
		finally {
			try {
				throw new ArrayIndexOutOfBoundsException("Arry is out of bomds");
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.err.println("Array is out of Bounds ");
			}
		}
	}

}
