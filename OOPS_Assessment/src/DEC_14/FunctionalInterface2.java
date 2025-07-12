package DEC_14;
interface Cube{
	int Cube(int b);
}

public class FunctionalInterface2 {
	public static void main(String[] args) {

		int a = 2;
		Cube cube = b->b*b*b;
		System.out.println("Cube: "+ cube.Cube(a));

	}
}