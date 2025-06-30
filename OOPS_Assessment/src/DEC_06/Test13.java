package DEC_06;
class a{
	public a() {
		System.out.println("A");
	}
	public a(int i) {
		this();
		System.out.println(i);
	}
	
}
class b extends a{
	public b() {
		System.out.println("B");
	}
	public b(int i) {
		this();
		System.out.println(i+3);
		
	}
}

public class Test13 {
	public static void main(String[] args) {
		new b(5);
	}

}
