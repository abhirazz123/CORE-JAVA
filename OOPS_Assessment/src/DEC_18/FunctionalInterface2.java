package DEC_18;
interface Cube{
	int cube(int b);
}
public class FunctionalInterface2 {
	public static void main(String[] args) {
		int a = 12;
		Cube cube = (int b)->b*b*b;
		System.out.println(cube.cube(a));
	}
}
