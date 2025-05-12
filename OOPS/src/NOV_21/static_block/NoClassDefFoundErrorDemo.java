package NOV_21.static_block;
class Hello{
	public void greet() {
		System.out.println("Hello Batch 39");
	}
}
public class NoClassDefFoundErrorDemo {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.greet();
	}

}
