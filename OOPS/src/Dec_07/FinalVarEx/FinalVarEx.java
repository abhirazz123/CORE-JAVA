package Dec_07.FinalVarEx;
class A {
	final int A = 10;
	public void setData() {
		//A = 10;// error
		System.out.println("A value is : "+A);
	}
}
public class FinalVarEx {
	public static void main(String[] args) {
		final A a1 = new A();
		a1.setData();
		
		//a1 = new A(); // error
		a1.setData();
	}
}
