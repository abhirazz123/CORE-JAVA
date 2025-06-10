//Program on Anonymous inner class using Concrete class 
package Dec_10.anonymous_inner_Class;
class Super{
	public void show() {
		System.out.println("Super Class show method");
	}
}
public class AnonymousInnerDemo1 {
	public static void main(String[] args) {
		//Anonymous inner class
		Super sub = new Super() {
			@Override
			public void show() {
				System.out.println("Sub class method");
			}
		};
		sub.show();
	}
}
