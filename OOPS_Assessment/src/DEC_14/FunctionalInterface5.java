package DEC_14;

interface StringComparator {
	int compare(String s);
}
public class FunctionalInterface5 {
	public static void main(String[] args) {
		StringComparator comp = str -> str.compareTo("google");
		System.out.println(comp.compare("apple"));
		System.out.println(comp.compare("google"));  
		System.out.println(comp.compare("zebra")); 
	}
}
