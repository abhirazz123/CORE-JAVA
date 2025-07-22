package DEC_27.try_with_resourses;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			String x = null;
			System.out.println("It is Lenth is : "+x.length());
			
			try {
				String y = "NIT";
				int z = Integer.parseInt(y);
				System.out.println("z value is:"+z);
			} catch (NumberFormatException e) {
				System.err.println("Number is not in a proper format");
			}
		} catch (NullPointerException e) {
			System.err.println("Null Pointer problem");
		}
	}

}
