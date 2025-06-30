package DEC_06;

class NIT3
{
	static int a=90;
	String object;
	public NIT3(String name) {
		this.object=name;
		NIT3.this.a+=1;
	}
	static int get_counter()
	{
		return NIT3.a;
	}
}

public class OopsTest3
{
	public static void main(String[] args) {
		NIT3 nit = new NIT3("nit");
		NIT3 nit1 = new NIT3("nit");
		NIT3 nit2 = new NIT3("nit");
		NIT3 nit3 = new NIT3("nit");
		NIT3 nit4 = new NIT3("nit");
		NIT3 nit5 = new NIT3("nit");
		NIT3 nit6 = new NIT3("nit");
		NIT3 nit7 = new NIT3("nit");
		System.out.println(NIT3.get_counter()-91);
	}
}
