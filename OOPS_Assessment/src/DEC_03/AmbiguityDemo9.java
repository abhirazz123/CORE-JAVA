package DEC_03;

class Test9{		    
	public void accept(int b, int i) {
		System.out.println("int-int");
	}
	public void accept(int i, byte b) {
		System.out.println("int-byte");
	}
}
public class AmbiguityDemo9{
	public static void main(String[] args) {
		Test9 t1 = new Test9(); 
		byte b1 = 1;
		byte b2 = 2;
		t1.accept(b1, b2);

	}
}
