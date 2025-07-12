package DEC_06;
class Super2{
	public void show() {
		System.out.println("Show method of super class!!!!");
	}
}
class Sub2 extends Super2{
	@Override
	public void show() {
		System.out.println("Show method of sub class!!!!");
	}

}
public class VisibilityMode2 {
	public static void main(String[] args) {
		Super2 s = new Super2();
		s.show();

	}
}
