package NOV_28;
class Example {
	int x = 10;
	int y = 20;
	public Example()
	{
		x = 90;
		y = y+80;
	}
}
public class Test3 {
	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example();
		e2.x = 25;
		e1.x = e2.y + 10;
		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}
