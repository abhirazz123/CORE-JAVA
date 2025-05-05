package NOV_18.method_chaining;

public class MethodChainingDemo2 {
	public static void main(String[] args) {
		String str = "Hyderabad";
		int len = str.concat("Is an IT city").toLowerCase().length();
		System.out.println("Len: "+len);
	}

}
