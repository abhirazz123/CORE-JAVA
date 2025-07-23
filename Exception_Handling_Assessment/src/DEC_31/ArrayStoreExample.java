package DEC_31;

public class ArrayStoreExample {
	public static void storeObjects () {
		Object [] strings = new String[5];
		strings[0]= "Hello";
		strings[1]= "World";
		strings[2] = 111;
		
		System.out.println("Objects stored successfully.");
	}
	public static void main(String[] args) {
		
		try {
			storeObjects();
		} catch (ArrayStoreException e) {
			System.err.println("ArrayStoreException caught: Incompatible type "+e.getMessage());
			
		}
	}
}
