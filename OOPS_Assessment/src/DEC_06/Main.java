package DEC_06;
class Parent{
	int a = 18;
	float display() {
		int b = a*a;
		return b;
	}
}
class Chald extends Parent{
	float display() {
		float d = a/2;
		return d;
	}
}
public class Main {
	public static void main(String[] args) {
		Chald ch = new Chald();
		float num = ch.display();
		System.out.println(num);
		System.out.println();

	}
}
