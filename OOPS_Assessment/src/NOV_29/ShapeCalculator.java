package NOV_29;

public class ShapeCalculator {

    // Area of a square
    public double calculateArea(int sideLength) {
        if (sideLength < 0) {
            System.out.println("Error: Side length must be non-negative.");
            return -1;
        }
        return sideLength * sideLength;
    }

    // Area of a rectangle
    public double calculateArea(int length, int width) {
        if (length < 0 || width < 0) {
            System.out.println("Error: Length and width must be non-negative.");
            return -1;
        }
        return length * width;
    }

    // Area of a circle
    public double calculateArea(double radius) {
        if (radius < 0) {
            System.out.println("Error: Radius must be non-negative.");
            return -1;
        }
        return Math.PI * radius * radius;
    }
}
