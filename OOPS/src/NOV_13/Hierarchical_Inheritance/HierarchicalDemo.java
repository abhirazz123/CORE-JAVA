package NOV_13.Hierarchical_Inheritance;
import java.text.DecimalFormat;
import java.util.Scanner;

class Shape{
	protected  int x;
	public Shape(int x) {
		this.x = x;
	}
}
class Circle extends Shape{
	final double  PI = 3.14;
	public Circle(int redius) {
		super(redius);
	}
	public void AreaofCircle() {
		double area = PI*x*x;
		DecimalFormat df = new DecimalFormat("000.000");
		System.out.println("Area of Circle is :"+df.format(area));	
	}

}
class Rectangle  extends Shape{
	protected int breadth;
	public Rectangle (int length, int breadth) {
		super(length);
		this.breadth = breadth;
	}
	public void AreaOfRectangle() {
		double area = super.x*this.breadth;
		System.out.println("Area of Rectangle: "+area);
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print("Enter the resius of Circle: ");
		int resius = sc.nextInt();

		Circle circle = new Circle(resius);
		circle.AreaofCircle();

		System.err.print("Enter the length of the Rectangle :");
		int length = sc.nextInt();

		System.err.print("Enter the Breadth of the Rectangle :");
		int breadth = sc.nextInt();

		Rectangle rect = new Rectangle(breadth, breadth);
		rect.AreaOfRectangle();

	}
}