package Dec_05.Method_Hiding;
class Super{
	public void m1() {//object
	}
}
class sub extends Super{
	//public static void m1() {// class
	public void m1() {
	}
}
public class MethodHidingDemo3 {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}
}
