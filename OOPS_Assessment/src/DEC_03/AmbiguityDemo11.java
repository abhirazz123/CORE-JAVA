package DEC_03;
class Test11
{
	public void accept(int b, Integer i) {
		System.out.println("int-Integer");
	}
	public void accept(long i, int b) {
		System.out.println("long-int");
	}
	public void accept(long i, Object b) {
		System.out.println("long-Object");
	}
}
public class AmbiguityDemo11{
	public static void main(String[] args) {
		Test11 t1 = new Test11();
		t1.accept(2,4);

	}

}

