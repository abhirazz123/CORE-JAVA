//Program that describes how to initialize super class properties:
package Dec_09.Abstraction;
abstract class Shope{
	protected String shopeType;
	public Shope(String shapeType ) {
		this.shopeType = shapeType;
	}
	public abstract void draw();
}
class Rectangle extends Shope{
	public Rectangle(String shapeType) {
		super(shapeType);
	}
	@Override
	public void draw() {
		System.out.println("Drawing "+shopeType);
	}
}
class Circle extends Shope{
	public Circle(String shapeType) {
		super(shapeType);
	}
	@Override
	public void draw() {
		System.out.println("Drawing "+shopeType);
	}
}
public class AbstractDemo3 {
	public static void main(String[] args) {
		Shope s1= null;
		s1 = new Rectangle("Rectangle");s1.draw();
		s1 = new Circle("Circle");s1.draw();
	}
}
