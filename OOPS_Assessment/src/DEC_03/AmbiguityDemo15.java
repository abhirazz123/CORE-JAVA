package DEC_03;

class Test15{		    
	public void accept(String x){
		System.out.println("String");
	}	
	
	public void accept(Object y){
		System.out.println("Object");
	}	
}
public class AmbiguityDemo15{
	public static void main(String[] args) {
		Test15 t1 = new Test15();
		t1.accept("Ravi");
		t1.accept(null);
	}
}
