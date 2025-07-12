package DEC_03;
class Test4
{

	public void accept(int ...s){
		System.out.println("int :");
	}

	public void accept(short ...s){
		System.out.println("short :");
	}
}
public class AmbiguityDemo4{
	public static void main(String[] args) {
		Test4 t1 = new Test4();
		t1.accept();
	}
}
