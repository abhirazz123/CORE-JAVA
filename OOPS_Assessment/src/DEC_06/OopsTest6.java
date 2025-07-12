package DEC_06;
class NIT6
{
	static int a=90;
	String object;
	public NIT6(String name) {
		this.object=name;
		NIT6.a+=1;
	}
	static int get_counter ()
	{
		return NIT6.a;
	}
}

public class OopsTest6
{
	public static void main(String[] args) {
		NIT6 nit  = new NIT6("nit");
		NIT6 nit1 = new NIT6("nit");
		NIT6 nit2 = new NIT6("nit");
		NIT6 nit3 = new NIT6("nit");
		NIT6 nit4 = new NIT6("nit");
		NIT6 nit5 = new NIT6("nit");
		NIT6 nit6 = new NIT6("nit");
		NIT6 nit7 = new NIT6("nit");
		System.out.println(NIT6.get_counter()-91);
	}
}
