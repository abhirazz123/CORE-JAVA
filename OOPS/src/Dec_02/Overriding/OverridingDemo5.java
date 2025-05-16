package Dec_02.Overriding; 
class Super5{
	private void m1() {
		System.out.println("Privare Method of super class");
	}
}
class Sub5 extends Super5{
	protected void m1() { // Re-declaration of Method 
		System.out.println("Method Re-declaration");
	}
}
public class OverridingDemo5 {
	public static void main(String[] args) {
		new Sub5().m1();
	}
}
