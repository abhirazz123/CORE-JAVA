package DEC_17;
interface Drawable{
	void draw();
}
public class FunctionalInterface {
	public static void main(String[] args) {
	Drawable result =	() -> System.out.println("Drawing...");	
	result.draw();
	}
}