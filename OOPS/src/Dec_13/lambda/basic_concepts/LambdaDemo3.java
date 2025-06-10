package Dec_13.lambda.basic_concepts;
interface Length{
	int getLenth(String str) ;
}
public class LambdaDemo3 {
	public static void main(String[] args) {
		Length l = str->str.length();
		System.out.println("Lenth : "+l.getLenth("india"));
	}
}
