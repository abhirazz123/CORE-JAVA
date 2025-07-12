package NOV_29;

public class Main2 {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();

        // Test Case 1: Area of circle
        double radius = 7.0;
        double areaCircle = calc.calculateArea(radius);
        if (areaCircle != -1) {
			System.out.println("Area of circle with radius " + radius + ": " + areaCircle);
		}

        // Test Case 2: Area of square with negative side length
        int sideLength = -5;
        double areaSquare = calc.calculateArea(sideLength);
        if (areaSquare != -1) {
			System.out.println("Area of square with side " + sideLength + ": " + areaSquare);
		}

        // Test Case 3: Area of rectangle with negative length
        int length = -5;
        int width = 10;
        double areaRectangle = calc.calculateArea(length, width);
        if (areaRectangle != -1) {
			System.out.println("Area of rectangle with length " + length + " and width " + width + ": " + areaRectangle);
		}
    }
}
