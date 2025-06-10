package Dec_11.Loose_oupling;
public class LooseCoupling {
	public static void main(String[] args) {
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
		Restaurant.acceptObject(new Horlicks());
	}
}
