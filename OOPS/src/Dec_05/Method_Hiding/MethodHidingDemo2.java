package Dec_05.Method_Hiding;
class Subper{
	//public static void m2() {//class
	public void m2() {
		
	}
}
class Sub extends Subper{
	public void m2() {//object //error
	}
}
public class MethodHidingDemo2 {
	public static void main(String[] args) {
		System.out.println("Hello!!");
	}

}
