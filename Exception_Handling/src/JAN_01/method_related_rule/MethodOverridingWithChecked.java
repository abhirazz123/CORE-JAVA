package JAN_01.method_related_rule;
import java.io.FileNotFoundException;
import java.io.IOException;

class Super{
	public void show() throws ClassNotFoundException {
		System.out.println("Super class method not throwing checked Exception");
	}
	class Sub extends Super{
		@Override
		public void  show() throws ClassNotFoundException {//error
			System.out.println("Sub class method should not throw checked Exception");
		}
	}
}
public class MethodOverridingWithChecked {
	public static void main(String[] args) {
		
	}

}
