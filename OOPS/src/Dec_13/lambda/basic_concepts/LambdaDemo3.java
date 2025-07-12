package Dec_13.lambda.basic_concepts;
interface length{
	int getlength(String str);
}
public class LambdaDemo3 {
	public static void main(String[] args) {
		length l =str->str.length();
		System.out.println("Lenth: "+l.getlength("Abhishek"));
	}
}
