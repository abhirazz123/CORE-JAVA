package DEC_03;
class Test
{
	public void accept(long ...b)   {
		System.out.println("long :");
	}

	public void accept(double ...s){
		System.out.println("double :");
	}

	public void accept(float ...s){
		System.out.println("float :");
	}
}
public class AmbiguityDemo1{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.accept();
	}
}
