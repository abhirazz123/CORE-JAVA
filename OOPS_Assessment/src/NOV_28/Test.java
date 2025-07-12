package NOV_28;
class Demo {
	int x;
	int y;

	// No-arg constructor
	public Demo() {
		x = 10;        // Step 1: x = 10
		y = x++;       // Step 2: y = 10, x becomes 11 (post-increment)

		x = this.y + this.x; // Step 3: x = 10 (y) + 11 (x) = 21
		this.y = y + this.y; // Step 4: y = 10 (local y) + 10 (this.y) = 20
	}

	// Parameterized constructor
	public Demo(int x, int y) {
		this.x = x + x;   // this.x = 20 + 20 = 40
		this.y = y + y;   // this.y = 45 + 45 = 90
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println(new Demo().x + new Demo().y); // 20 +21 = 41
		Demo demo = new Demo(20,45);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y)); // -90+21= -69
		//						21, 90,
	}

}
