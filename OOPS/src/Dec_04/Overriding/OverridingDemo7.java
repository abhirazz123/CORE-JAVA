package Dec_04.Overriding;
class Super7{
	public void m1() {	
		System.out.println("Super");
	}
}
class sub extends Super7{
	@Override
	/*public int m1() // error[ int is not compatible with void]
	{
		return 0;
	}*/
	public void m1() {
		System.out.println("Sub");
	}
}
public class OverridingDemo7 {
	public static void main(String[] args) {
		Super7 s = new Super7();
		s.m1();
	}
}
