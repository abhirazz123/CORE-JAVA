package JAN_08;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static int test(String s) {     
		Set<Character> set = new HashSet<>();     
		int left = 0, max = 0;

		for (int right = 0; right < s.length(); right++) {     //0<10

			while (!set.add(s.charAt(right))) {
				set.remove(s.charAt(left++));
			}

			max = Math.max(max, right - left + 1);
		}

		return max;
	}

	public static void main(String[] args) {
		String input = "abcabcbdee";
		System.out.println("Result: " + test(input));

		
	}
}
