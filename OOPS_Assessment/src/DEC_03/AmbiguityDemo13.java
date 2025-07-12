package DEC_03;

 class Test13{
	public void accept(int ...s){
		System.out.println("int var args :");
	}

	public void accept(int x, int ...y){
		System.out.println("int int var args");
	}
}
public class AmbiguityDemo13{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.accept(9);

	}
}
