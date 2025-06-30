package DEC_10;

public class Test extends Car {
    public Test(String brand, String model, int mileage, int topSpeed, int yearOfManufacturing) {
		super(brand, model, mileage, topSpeed, yearOfManufacturing);
		
	}

	@Override
    public void display() {
        System.out.println("Car Brand: " + carBrand());
        System.out.println("Car Model: " + carModel());
        System.out.println("Car Mileage: " + carMileage() + " km/l");
        System.out.println("Car Top Speed: " + carTopSpeed() + " km/h");
        System.out.println("Year of Manufacturing: " + carYear());
    }

    public static void main(String[] args) {
        Test car = new Test("BMW", "M-5", 5, 500, 2024);
        car.display();
    }
}