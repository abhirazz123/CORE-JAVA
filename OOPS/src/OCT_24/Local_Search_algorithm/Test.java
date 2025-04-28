package OCT_24.Local_Search_algorithm;

public class Test {
	static int a = 100;// Class Variable Or Static Field
	int b = 200; 		// Instance variable Non static  Field
	public void accept(int c) {
		int d = 400;
		System.out.println("a: "+Test.a);
		System.out.println("b: "+this.b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.accept(300);

	}

}
