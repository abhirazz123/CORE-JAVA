package DEC_03;
class Test2
{	
	    
	public void accept(byte ...s){
		System.out.println("byte :");
	}	
	
	public void accept(short ...s){
		System.out.println("short :");
	}	
}
public class AmbiguityDemo2
{
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.accept();

	}
}
