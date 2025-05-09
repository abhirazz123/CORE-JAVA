package NOV_21.static_block;
class Foo{
	Foo(){
		System.out.println("No Argument constructor..");
	}{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block...");
	}
}

public class StaticBlockDemo {
	public static void main(String[] args) {
		System.out.println("Main Method Executed ");
	}

}
