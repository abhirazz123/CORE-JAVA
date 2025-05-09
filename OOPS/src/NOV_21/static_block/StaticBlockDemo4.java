package NOV_21.static_block;
class A{	// AD BC EF
	static {
		System.out.println("A");
	}{
		System.out.println("B");
	}
	A(){
		System.out.println("C");
	}
}
class B extends A{
	static {
		System.out.println("D");
	}{
		System.out.println("E");
	}
	B(){
		System.out.println("F");
	}
}
public class StaticBlockDemo4 {
	public static void main(String[] args) {
		new B();
	}

}
