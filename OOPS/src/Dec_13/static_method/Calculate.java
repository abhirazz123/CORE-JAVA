package Dec_13.static_method;
public interface Calculate {
	static double getSquare(int num) {
		return num*num;
	}
	static double getCube(int num) {
		return num*num*num;
	}
}
