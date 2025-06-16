package DEC_03;

class Test12{		    
	public void accept(int b, Integer i) {
		System.out.println("int-Integer");
	}
	
	public void accept(Byte b, byte i) {
		System.out.println("Byte-byte");
	}
	
	public void accept(byte... l) {
		System.out.println("byte...");
	}
}
public class AmbiguityDemo12{
	public static void main(String[] args) {
		Test12 t1 = new Test12(); 
		t1.accept(2,4);
		
		byte b1 = 8;
		byte b2 = 9;		
		t1.accept(b1, b2);

	}
}
