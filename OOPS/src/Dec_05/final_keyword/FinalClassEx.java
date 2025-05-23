package Dec_05.final_keyword;
final class A{
	private int x = 100;
	public void setData() {
		x = 120;
		System.out.println(x);
	}
}
class B extends A{
	
}
public class FinalClassEx {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setData();
	}
}
