package DEC_27.try_with_resourses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc){
			System.out.println("Enter your Salary :");
			double sal = sc.nextDouble();
			System.out.println("Salary is :"+sal);
		}
		catch(InputMismatchException e){
			System.err.println("Input is Inavlid");
		}
	}
}
