package NOV_1;
class Circle {
	double redius;

	Circle (){
		this.redius = 1.0;
	}
	Circle(double redius) {
		if(redius<=0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}else {
			this.redius = redius;
		}
	}
	public double getArea() {
		if(redius<=0) {
			return -1;

		}
		return Math.PI * redius*redius;
	}
}
class Cylinder  extends Circle{
	double height;
	Cylinder(){
		super();
		this.height = 1.0;
	}
	public Cylinder( double redius, double height) {
		super(redius);
		if(height<=0) {
			System.out.println("Error invalid input");
			System.exit(0);
		}else {
			this.height = height;
		}
	}
	public double getVolume() {
		if(height<0) {
			System.out.println("Error Invalid input");
		}
		return getArea()*height;

	}

}
public class ShapeTester  {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(5, 5);
		c.getVolume();

		System.out.println("Volume = " + Math.round(c.getVolume() * 10.0) / 10.0);
		System.out.println("Area = " + Math.round(c.getArea() * 10.0) / 10.0);
	}



}
