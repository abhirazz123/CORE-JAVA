package Dec_07.Abstraction;
abstract class Shape{
	public abstract void draw();
}
class Square extends Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}	
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class AbstractDemo1 {
	public static void main(String[] args) {
		Shape s1 = null;
		s1 = new Circle(); s1.draw();
		s1 = new Square();s1.draw();
	}
}
