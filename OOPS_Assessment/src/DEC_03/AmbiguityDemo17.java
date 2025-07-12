package DEC_03;

class Test17{
	public void accept(Integer x){
		System.out.println("Integer");
	}

	public void accept(long y){
		System.out.println("long");
	}
}
public class AmbiguityDemo17{
	public static void main(String[] args) {
		Test17 t1 = new Test17();
		t1.accept(15);

	}
}
