package Dec_18.custom_fun_interface;

interface TriFunction<T,U,V,R>{
	public abstract R myApply(T a,U b,V c);
}

public class CustomFunctionalInterface {
	public static void main(String[] args) {
		TriFunction<Integer,Integer, Integer, String> fn1 = (a, b, c)->""+a+b+c;
		System.out.println(fn1.myApply(12, 24, 44));
		
	}

}
