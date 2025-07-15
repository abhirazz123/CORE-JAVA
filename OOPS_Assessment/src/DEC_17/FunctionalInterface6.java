package DEC_17;
interface StringComparator{
	int compare(String s);
}

public class FunctionalInterface6 {
	public static void main(String[] args) {
		StringComparator str = s->s.compareTo("googel");
		System.out.println(str.compare("apple"));
		System.out.println(str.compare("banana"));
		System.out.println(str.compare("Oringe"));
	}
}
