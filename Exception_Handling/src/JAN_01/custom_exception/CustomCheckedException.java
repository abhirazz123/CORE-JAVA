package JAN_01.custom_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException () {
		
	}
	public InvalidAgeException (String errorMessage) {
		super(errorMessage);
	}
}

public class CustomCheckedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc) {
			System.out.println("Enter the Age: ");
			int age = sc.nextInt();
			 validdateAge(age);
		} catch (InvalidAgeException e) {
			System.err.println("You are not allowed for Mavie ");
		}
		
	}
	public  static void validdateAge(int  age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age is Invalid");
		}
		else {
			System.out.println("You are allowed for Movie");
		}
	}

}
