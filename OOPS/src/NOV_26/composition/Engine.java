package NOV_26.composition;

public class Engine  {
	private String engineType;
	private int horsePower;
	public Engine(String engineType, int horsePower) {
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	

}
