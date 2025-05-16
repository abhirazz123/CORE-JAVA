package OCT_5.basic.command_line_Argument;

public class FindingAreaOfCircle {

    public static void main (String[] args) {
        // Converting String to double
        double radius = Double.parseDouble(args[0]);  // Takes radius from command-line
        final double PI = 3.14;

        double area = PI * radius * radius;  // Formula: π * r^2
        System.out.println("Area of Circle is :" + area);
    }

}
