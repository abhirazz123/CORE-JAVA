package Dec_13.lambda.basic_concepts;

import java.util.Scanner;

@FunctionalInterface
interface Calculator1 {
    double getSquareAndCube(Integer num);
}

public class LambdaDemo5 {
    public static void main(String[] args) {
        Calculator1 cal = num -> {
            if (num < 0) {
                return 1.0;
            } else if (num % 2 == 0) {
                return num * num; // square for even
            } else {
                return num * num * num; // cube for odd
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        System.err.println("Result: " + cal.getSquareAndCube(no));
        sc.close();
    }
}
