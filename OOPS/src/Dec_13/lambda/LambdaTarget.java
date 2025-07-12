package Dec_13.lambda;

abstract class Drawable {
    abstract void draw();
}

public class LambdaTarget {
    public static void main(String[] args) {
       // Drawable d = () -> System.out.println("Drawable");
      //  d.draw();
    }
}
//The above program will generate compilation error, Lambda Target must be Functional interface.