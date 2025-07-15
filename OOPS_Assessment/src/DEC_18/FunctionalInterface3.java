package DEC_18;
interface Add3{
	int add (int b);
	//int add(int a, int b);// Only this one is allowed if you want to use lambda
}

public class FunctionalInterface3 {
	public static void main(String[] args) {
		int a = 21;
		Add3 add = b->b+b;
		System.out.println(add.add(a));
	}

}
