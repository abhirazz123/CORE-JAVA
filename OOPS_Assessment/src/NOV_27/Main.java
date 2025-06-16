package NOV_27;
class Driver{
		private String name;
		private int age;
		
		public Driver(String name, int age) {
			if(age>0) {
				this.name = name;
				this.age = age;
			}else {
				System.out.println("Error Invalid input");
			}
		}

	    // Copy constructor for deep copy
		public Driver(Driver other) {
			this.name = other.name;
			this.age = other.age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
	        if (age <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.age = age;
	    }

}

class Car{
		private String brand;
		private String model;
		private int year;
		private Driver driver;
		
		public Car(String brand, String model, int year, Driver driver) {
	        if (year <= 0) {
	            System.out.println("Error Invalid Input");
	            System.exit(0);
	        }
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	        this.driver = driver;
	    }

	    // Copy constructor for deep copy
		public Car(Car other) {
			this.brand = other.brand;
			this.model = other.model;
			this.year = other.year;
			this.driver = new Driver(other.driver); 
			
		}
		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		  public void setYear(int year) {
		        if (year <= 0) {
		            System.out.println("Error Invalid Input");
		            System.exit(0);
		        }
		        this.year = year;
		    }
		public Driver getDriver() {
			return driver;
		}

		public void setDriver(Driver driver) {
			this.driver = driver;
		}
		public void changeDriver(Driver newDriver) {
	        this.driver = newDriver;
	    }

		public void printDetails(String title) {
	        System.out.println(title);
	        System.out.println("Car Brand: " + brand);
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	        System.out.println("Driver Name: " + driver.getName());
	        System.out.println("Driver Age: " + driver.getAge());
	        System.out.println();
	    }
		
}
public class Main {
	public static void main(String[] args) {
		  // Creating original driver and car
        Driver driver1 = new Driver("John", 30);
        Car car1 = new Car("Hyundai", "Creta", 2020, driver1);

        // Creating deep copy of car
        Car car2 = new Car(car1);

        // Printing original and copied car details
        car1.printDetails("Original Car Details:");
        car2.printDetails("Copied Car Details:");

        // Change the driver of the original car
        Driver driver2 = new Driver("Logan", 35);
        car1.changeDriver(driver2);

        // Printing again after changing driver in original car
        car1.printDetails("Original Car Details after Changing Driver:");
        car2.printDetails("Copied Car Details after Changing Driver in Original Car:");
	}

}
