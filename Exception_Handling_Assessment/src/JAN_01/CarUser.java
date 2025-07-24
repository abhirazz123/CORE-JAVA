package JAN_01;
class CarStoppedException extends Exception{
	public CarStoppedException(String message) {
		super(message);
	}
}
class CarHeatException extends Exception{
	public CarHeatException(String message) {
		super(message);
	}
	
}
class CarPunctureException extends Exception{
	public CarPunctureException (String message) {
		super(message);
	}
}
class CarTest  {
	public static  void Stop (String action) throws CarStoppedException {
		if("stop".equalsIgnoreCase(action)) {
			throw new CarStoppedException("Car stopped for some reason.");
		}else {
			System.out.println("Car not stalled.");
		}
		
	}
	public static void puncture(String status) throws CarPunctureException {
		if("puncture".equalsIgnoreCase(status)) {
			throw new CarPunctureException("Car is punctured.");
		}else {
			System.out.println("Car not punctured");
		}
		
	}
	public static void CarHeat(int temperature) throws CarHeatException {
		if(temperature>50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
			
		}else {
			System.out.println("Car temperature normal.");
		}
			
	}
	
}
public class CarUser {
	public static void main(String[] args) {
		try {
			CarTest.Stop("stop");
		} catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.Stop("go");
		} catch (CarStoppedException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.puncture("puncture");
		} catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.puncture("move");
		} catch (CarPunctureException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.CarHeat(60);
		} catch (CarHeatException e) {
			System.out.println(e.getMessage());
		}
		try {
			CarTest.CarHeat(40);
		} catch (CarHeatException e) {
			System.out.println(e.getMessage());
		}
	}

}
