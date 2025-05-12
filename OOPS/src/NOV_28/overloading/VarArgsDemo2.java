package NOV_28.overloading;
class AddParameter{
	public void acceptAddParameter(int ...values) {
		int sum = 0;
		for(int value:values) {
			sum = sum+value;
		}
		System.out.println("Sum of parameter is :"+sum);
	}
}
public class VarArgsDemo2 {
	public static void main(String[] args) {
		AddParameter  a = new AddParameter ();
		a.acceptAddParameter(10,20,30);
		a.acceptAddParameter(100,200,300,400);
	}

}
