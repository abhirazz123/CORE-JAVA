package DEC_20;

import java.util.function.Predicate;

public class CalculationLogic {
	public static boolean testPredicate(int number,Predicate<Integer>predicate) {
		return predicate.test(number);
	}
	public static void main(String[] args) {
		int number1 = 13;
        int number2 = 6;
        int number3 = 17;
        
       Predicate<Integer> isEven = n->n%2==0;
       System.out.println(number1+" is even "+isEven.test(number1));
       
       Predicate<Integer>isGreaterThanTen =n->n>=10;
       System.out.println(number1+" is greater than  "+isGreaterThanTen.test(number1));
       
       Predicate<Integer> isPrime = n->{
    	   if(n<=1) return false;
    	   for(int i=2; i*i<=n;i++ ) {
    		   if(n%i==0) return false;
    	   }
		   return true;
    	   
       };
       System.out.println(number1+" is prime: "+isPrime.test(number1));
	}

}
