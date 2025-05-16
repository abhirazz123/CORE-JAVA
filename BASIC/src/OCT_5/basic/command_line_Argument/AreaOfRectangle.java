package OCT_5.basic.command_line_Argument;
public class AreaOfRectangle {
	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);

		int area = length * breadth;
		System.out.println("Area of rectangle is :"+area);
	}
}
