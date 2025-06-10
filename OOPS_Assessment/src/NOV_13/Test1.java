package NOV_13;

class Vehicle {
    String make;
    String model;
    int year;

   public  Vehicle(String make, String model, int year) {
        if (year <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.make = make;
        this.model = model;
        this.year = year;
    }

   public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        if (numberOfDoors <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
  public  void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    String type;

    Bike(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
   public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Q8", 2021, 4);
        System.out.println("Car Details:");
        car.displayDetails();

        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike.displayDetails();
    }
}