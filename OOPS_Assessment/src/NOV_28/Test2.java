package NOV_28;
class Demo2 {
	int x;
	int y;
	public Demo2() {
		x = 10;
		y = x++;
	}
	public Demo2(int x, int y) {
		this.x += this.x + x++;
		this.y -= this.x + --y;
	}
}
public class Test2 {
	public static void main(String[] args) {
		System.out.print(new Demo2().x + new Demo2().y);
		Demo2 demo = new Demo2(30, 50);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}
