package DEC_03;

class Test7
{
	public void accept(byte b, int i) {
		System.out.println("byte-int");
	}
	public void accept(int i, byte b) {
		System.out.println("int-byte");
	}
}
public class AmbiguityDemo7
{
	public static void main(String[] args)
	{
		Test7 t1 = new Test7();
		t1.accept((byte)1,2);
	}

}

