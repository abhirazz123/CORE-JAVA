package DEC_24.exception.basic;

import java.util.Scanner;

public class SpecificException {
	public static void main(String[] args) {
		System.out.println("Main started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the your Roll: ");
			int roll = sc.nextInt();
			
			System.out.println("Your Roll is : "+roll);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("Main ended");
	}
}
