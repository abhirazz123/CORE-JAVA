package NOV_15;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        if (name == null ||  price <= 0) {
            System.out.println("Error: Invalid input");
        } else {
            this.name = name;
            this.price = price;
        }
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

    public int calculateTotalCost(int quantity) {
        return (int) (price * quantity);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

// Electronics Class
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        if (brand == null) {
            System.out.println("Error: Brand name missing.");
        } else {
            this.brand = brand;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics Product:");
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }

    @Override
    public String toString() {
        return "Electronics [name=" + name + ", price=" + price + ", brand=" + brand + "]";
    }
}

// Clothing Class
class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        if (size == null) {
            System.out.println("Error: Size missing.");
        } else {
            this.size = size;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing Product:");
        super.displayInfo();
        System.out.println("Size: " + size);
    }

    @Override
    public String toString() {
        return "Clothing [name=" + name + ", price=" + price + ", size=" + size + "]";
    }
}
