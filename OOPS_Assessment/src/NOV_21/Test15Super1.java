package NOV_21;

public class Test15Super1 {
    int x = 10;

    static void m1() {
        System.out.println("Test15Super : m1()");
    }

    static {
        System.out.println("Test15Super : SB1 called");
    }
}

class Test15Sub extends Test15Super1 {
    static int x = 20;

    static {
        System.out.println("Test15Sub : SB1 called");
    }

    static void m2() {
        m1();
        System.out.println("Test15Sub : m2()");
    }

    public static void main(String[] args) {
        m2();
    }
}
