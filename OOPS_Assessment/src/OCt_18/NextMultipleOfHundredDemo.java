package OCt_18;

public class NextMultipleOfHundredDemo {
	public static void main(String[] args) {
		int number = 123;
		int result = NextMultipleOfHundred.getNextMultipleOfHundred(number);
		System.out.println("Next multiple of 100 for " + number + " is: " + result); // Output: 200

		number = 250;
		result = NextMultipleOfHundred.getNextMultipleOfHundred(number);
		System.out.println("Next multiple of 100 for " + number + " is: " + result); // Output: 300

		number = 999;
		result = NextMultipleOfHundred.getNextMultipleOfHundred(number);
		System.out.println("Next multiple of 100 for " + number + " is: " + result); // Output: 1000

	}

}
