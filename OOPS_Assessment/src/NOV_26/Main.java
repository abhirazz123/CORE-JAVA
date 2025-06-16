package NOV_26;

class Driver {
	private String name;
	private int age;

	public Driver(String name, int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Error Invalid Input");
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Error Invalid Input");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver Name: " + name + ", Driver Age: " + age;
	}
}

class Car1 {
	private String brand;
	private String model;
	private int year;
	private Driver driver;

	public Car1(String brand, String model, int year, Driver driver) {
		if (year <= 0) {
			throw new IllegalArgumentException("Error Invalid Input");
		}
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}

	// Copy constructor for deep copy
	public Car1(Car1 original) {
		this.brand = original.brand;
		this.model = original.model;
		this.year = original.year;
		this.driver = new Driver(original.driver.getName(), original.driver.getAge());
	}

	public void changeDriver(Driver newDriver) {
		this.driver = newDriver;
	}

	@Override
	public String toString() {
		return "Car Brand: " + brand + "\nCar Model: " + model + "\nCar Year: " + year + "\n" + driver;
	}
}

public class Main {
	public static void main(String[] args) {
		try {
			Driver driver1 = new Driver("John", 30);
			Car1 car1 = new Car1("Hyundai", "Creta", 2020, driver1);

			// Create a deep copy of car1
			Car1 car2 = new Car1(car1);

			System.out.println("Original Car Details:");
			System.out.println(car1);

			System.out.println("\nCopied Car Details:");
			System.out.println(car2);

			// Change driver of original car
			Driver driver2 = new Driver("Logan", 35);
			car1.changeDriver(driver2);

			System.out.println("\nOriginal Car Details after Changing Driver:");
			System.out.println(car1);

			System.out.println("\nCopied Car Details after Changing Driver in Original Car:");
			System.out.println(car2);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
