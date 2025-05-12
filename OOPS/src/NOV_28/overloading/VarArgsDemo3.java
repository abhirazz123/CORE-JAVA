package NOV_28.overloading;
class Hetro{
	public void acceptHetro(Object ...x) {
		for(Object y : x) {
			System.out.println(y);
		}
	}
}
public class VarArgsDemo3 {
	public static void main(String[] args) {
		Hetro h = new Hetro();
		h.acceptHetro(12,89.32,'c',new String("NIT"));
	}

}
