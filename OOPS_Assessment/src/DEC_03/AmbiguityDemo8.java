package DEC_03;

class Test8
{		    
	public void accept(byte b, int i) {
		System.out.println("byte-int");
	}
	public void accept(int i, byte b) {
		System.out.println("int-byte");
	}
}
public class AmbiguityDemo8
{
	public static void main(String[] args) 
	{
		Test8 t1 = new Test8(); 
		byte b1 = 1;
		byte b2 = 2;
		t1.accept((int)b1, b2);
	}
}
