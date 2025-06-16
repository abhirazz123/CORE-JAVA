package NOV_15;

public class OnlineShopping {
	public static void main(String[] args) {
		Electronics laptop = new Electronics("Laptop", 1200.00, "Dell");
		laptop.displayInfo();
		System.out.println("Total Cost for 2 units: $" + laptop.calculateTotalCost(2));
		System.out.println(laptop);

		System.out.println();
		Clothing tshirt = new Clothing("T-Shirt", 25.00, "Medium");
		tshirt.displayInfo();
		System.out.println("Total Cost for 3 units: $" + laptop.calculateTotalCost(3));
		System.out.println(tshirt);
	}
}
