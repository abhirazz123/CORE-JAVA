package DEC_06;
class A {
	int i = 10;
	public void printValue() {
		System.out.println("Value-A");
	}
}
class B extends A{
	int i = 12;
	@Override
	public void printValue() {
		System.out.println("Value-B");
	}
}
public class Test11 {
	public static void main(String[] args) {
		A a = new A();
		a.printValue();
		System.out.println(a.i);
	}

}
