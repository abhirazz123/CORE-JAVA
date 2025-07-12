package DEC_14;
interface Add3{
	int Add3(int b);
	//int add3(int a, int b);//Error

}

public class FunctionalInterface3 {
	public static void main(String[] args) {
		int a = 21;
		Add3 add = b -> b + b;

		System.out.println("Add : "+ add.Add3(a));
	}

}
