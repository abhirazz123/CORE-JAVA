package Dec_19.interface_member;
interface Printable{
	
}
class print implements Printable{
	@Override 
	public String  toString() {
		return "Print[]";
		
	}
}

public class InterfaceMemberDemo2 {
	public static void main(String[] args) {
		Printable p = new print();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}
}
