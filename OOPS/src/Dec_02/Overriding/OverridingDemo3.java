package Dec_02.Overriding;
class Shape{
	public void draw() {
		System.out.println("Generic Draw");
	}
}
class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
}
public class OverridingDemo3 {
	public static void main(String[] args) {
		Shape s = null;
		s= new Rectangle(); s.draw();
		s= new Square(); s.draw();
	}

}
