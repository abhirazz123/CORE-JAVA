package DEC_03;

class Test3
{		    
	public void accept(int ...s){
		System.out.println("int :");
	}	
	
	public void accept(boolean ...s){
		System.out.println("boolean :");
	}	
}
public class AmbiguityDemo3
{
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		t1.accept(2);

	}
}
