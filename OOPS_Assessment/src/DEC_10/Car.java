package DEC_10;

public abstract class Car {
	String 	brand ;
	String model;
	int	mileage ;
	int	topSpeed ;
	int	yearOfManufacturing ;

	public Car(String brand, String model, int mileage, int topSpeed, int yearOfManufacturing) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.topSpeed = topSpeed;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public	String carBrand() {
		return brand;

	}
	public	String carModel() {
		return model;

	}
	public int carMileage() {
		return mileage;

	}
	public int carTopSpeed() {
		return topSpeed;

	}
	public int carYear() {
		return yearOfManufacturing;

	}
	abstract void display();

}
