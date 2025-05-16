package OCT_5.basic.command_line_Argument;

public class ArrayCalculationOnLength {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Length is 0");
        } else if (args.length == 1) {
            int num = Integer.parseInt(args[0]);
            System.out.println("Cube of " + num + " is " + (num * num * num));
        } else if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]); // Corrected index from args[2] to args[1]
            int sum = a + b;
            System.out.println("Sum is: " + sum);
        }
    }
}
