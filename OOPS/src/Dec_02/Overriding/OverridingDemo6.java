package Dec_02.Overriding;
class Super6{
	public void m1() {
	}
}
class Sub6 extends Super6{
	@Override
	//protected void m1() {//error [super class method AM is public ]
	public void m1() {
	}
}
public class OverridingDemo6 {
	public static void main(String[] args) {
		Super6 s6 = new Sub6();
		s6.m1();
	}

}
