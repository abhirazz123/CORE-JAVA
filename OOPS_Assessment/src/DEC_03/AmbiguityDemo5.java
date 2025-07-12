package DEC_03;

class Test5
{
	public void accept(int ...s){
		System.out.println("int :");
	}

	public void accept(char ...s){
	System.out.println("char :");
	}
}
public class AmbiguityDemo5
{
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		t1.accept();

	}

}
