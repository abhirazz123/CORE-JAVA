package Dec_11.Loose_oupling;
interface Hello{
	public static final int x = 100;
}
public class MainDemo {
	public static void main(String[] args) {
		System.out.println(Hello.x);//Hello interface is not loaded
	}

}
