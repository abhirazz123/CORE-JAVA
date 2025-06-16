package DEC_03;
class Test18
{		    
	public void accept(Integer x){
		System.out.println("Integer");
	}	
	public void accept(int ...y){
		System.out.println("var args");
	}	
}
public class AmbiguityDemo18{
	public static void main(String[] args) {
		Test18 t1 = new Test18();
		t1.accept(15);

	}
}
