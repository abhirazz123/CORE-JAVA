package Dec_07.sealed_ex;
sealed class BatteryVehicle permits BatteryCar, BatteryBike{
	public void run(){
		System.out.println("Running using Battery");
	}
}
non-sealed class BatteryCar extends BatteryVehicle{
	public void run(){
		System.out.println("Running Car by using Battery");
	}
}
non-sealed class BatteryBike extends BatteryVehicle{
	public void run(){
		System.out.println("Running Bike by using Battery");
	}
}
public class SelaedDemo2 {
	public static void main(String[] args) {
		BatteryVehicle b = null;
		b = new BatteryCar(); b.run();
		b = new BatteryBike(); b.run();
	}
}
