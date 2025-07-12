package DEC_14;

import java.util.function.Predicate;

public class FunctionalInterfaceExample16 {
	public static void main(String[] args) {
		String str[]= {"Java","Python","Naresh","IT"};

		Predicate<String> predicte = p->p.endsWith("va");
		
		for(String s:str) {
			if(predicte.test(s)) {
				System.out.println(s);
			}
		}
	}
}
