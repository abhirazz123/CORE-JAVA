package OCT_5.basic.command_line_Argument;
class Integer1{
	public static int getSquare(int num) {
		return num*num;
	}
	public static int getCube(int num) {
		return num*num*num;
	}
}
public class IntegerClassDemo {
	public static void main(String[] args) {
		int square = Integer1.getCube(10);
		System.out.println("square is: "+square);
		
		int cube = Integer1.getCube(4);
		System.out.println("Cube is :"+cube);
	}
}
