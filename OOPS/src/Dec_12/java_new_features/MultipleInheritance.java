package Dec_12.java_new_features;
interface Alpha{
	default void m1() {
		System.out.println("m1 method of  Alpha interface");
	}
}
interface Beta{
	default void m1() {
		System.out.println("m1 method of Beta interface");
	}
}
class MI implements Alpha,Beta{
	@Override
	public void m1() {//Overriding is compulsory, otherwise we will get compilation error 
		Alpha.super.m1();
		Beta.super.m1();
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		MI m = new MI();
		m.m1();
	}

}
