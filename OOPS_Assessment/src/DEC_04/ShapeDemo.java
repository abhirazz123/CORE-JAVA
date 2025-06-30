package DEC_04;
class Shape {
	public void drow() {
		System.out.println("Shape draw");
	}
	public void erase() {
		System.out.println("Shape erase");
	}
	public static Shape randShape() {
		int rand = (int) (Math.random() * 3);

		switch(rand) {
		case 0 :
			return new Circle() ;

		case 1 : 
			return new Square() ;

		case 2 : 
			return new	Triangle ();
		}
		return new Shape();	 
	}
}
class Circle extends Shape {
	public void	draw() {
		System.out.println("Circle draw");
	}
	public void erase() {
		System.out.println("Circle erase");
	}
}

class Triangle extends Shape{
	public void	draw() {
		System.out.println("Triangle draw");
	}
	public void erase() {
		System.out.println("Triangle erase");
	}

}

class Square extends Shape{
	public void	draw() {
		System.out.println("Square draw");
	}
	public void ersase() {
		System.out.println("Square erase");
	}
}
public class ShapeDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Shape s = Shape.randShape();
            s.drow();
            s.erase();
        }
    }
}
