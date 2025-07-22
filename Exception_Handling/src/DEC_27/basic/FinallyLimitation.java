package DEC_27.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int attempts = 0;
        while (attempts < 3) {
            try {
                System.out.print("Enter your Marks: ");
                int marks = sc.nextInt();
                System.out.println("Marks is " + marks);
            } catch (InputMismatchException e) {
                System.err.println("Input is invalid");
                sc.nextLine(); // clear invalid input
            } finally {
                System.out.println("Finally block");
                attempts++;
            }
        }
        
        sc.close();
    }
}
