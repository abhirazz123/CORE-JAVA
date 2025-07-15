package Dec_19.interface_member;
interface Acceptable{
	int MAX_VALUE = 500; // JDK 1.0
	void m1(); //JDK 1.8
	default void m2() {
		m4();
		m5();
	}
	static void m3() {
		m4();
	}
	private static void m4() { //java 9
		System.out.println("private static ");
	}
	private void m5() {
		System.out.println("Private static no static method");
	}
	
}
class Accept  implements Acceptable{

	@Override
	public void m1() {
		System.out.println("M1 overridden Method");
		
	}
	
}

public class InterfaceMemberFromJava9 {
	public static void main(String[] args) {
		Acceptable a = new Accept();
		a.m1();
		a.m2();
		Acceptable.m3();
	}

}
