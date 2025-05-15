package Dec_02.Overriding;
class RBI {
	protected String ifcCode = "RBIHYD6343";
	public String loan() {
		return "Bank should provide loan";	
	}
}
class SBI extends RBI{
	protected String ifcCode = "SBIAMT3204";
	@Override
	public String loan() {
		return "Providing loan @ 9.2% ROI";
	}
}
public class OverridingDemo4 {
	public static void main(String[] args) {
		RBI r = new SBI();
		System.out.println(r.ifcCode+" : "+r.loan());
	}

}
