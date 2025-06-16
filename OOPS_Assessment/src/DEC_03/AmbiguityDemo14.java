package DEC_03;

class Test14
{		    
	public void accept(int x){
		System.out.println("int");
	}	
	
	public void accept(long y){
		System.out.println("long");
	}	
}
public class AmbiguityDemo14{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.accept(9);

	}
}
