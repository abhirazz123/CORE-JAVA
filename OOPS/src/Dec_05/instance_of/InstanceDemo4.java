package Dec_05.instance_of;
class Bird{
}
class Parrot extends Bird{}
class Sparrow extends Bird{}
public class InstanceDemo4 {
	public static void main(String[] args) {
		Parrot p = new Parrot();
		Sparrow s = new Sparrow();
		acceptBirdType(s);
	}
	public static void acceptBirdType( Bird bird) {
		if(bird instanceof Parrot) {
			System.out.println("it is Object of Parrot");
		}
		else {
			System.out.println("Another Object");
		}
	}
}
