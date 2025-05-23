package Dec_07.FinalMethodEx;

class A {
    protected int a = 10;
    protected int b = 20;

    // Uncomment below line to make this method final and prevent overriding
    // public final void Calculate() {
    public void Calculate() {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}

class B extends A {
    // If method in A is final, this will cause a compile-time error
    @Override
    public void Calculate() {
        int mul = a * b;
        System.out.println("Multiplication is: " + mul);
    }
}

public class FinalMethodEx {
    public static void main(String[] args) {
        A a1 = new B();     // Polymorphism: reference of A, object of B
        a1.Calculate();     // Calls B's overridden method
    }
}
