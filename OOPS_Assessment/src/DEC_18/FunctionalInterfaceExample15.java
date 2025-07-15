package DEC_18;

import java.util.function.Predicate;

public class FunctionalInterfaceExample15 {
	public static void main(String[] args) {
		String[] str = {"Java","Python","Naresh","IT"};
		Predicate<String> predecat = p->p.endsWith("va");
		for(String s :str) {
			if(predecat.test(s))
				System.out.println(s);
		}
	}
}
