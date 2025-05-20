package Dec_05.Method_Hiding;
class Parent{
	public static void show() {
		System.out.println("Show method of Parent class");
	}
}
class Child extends Parent{	
}
public class MethodHidingDemo1 {
	public static void main(String[] args) {
		Child.show();
		Child c1 = new Child();
		c1.show();
	}
}
