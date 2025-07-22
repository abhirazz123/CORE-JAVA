package JAN_01.record;

public class Main {
	public static void main(String[] args) {

		ProductClass p1 = new ProductClass(111, "Camera");
		System.out.println(p1);
		ProductClass p2 = new ProductClass(111, "Camera");
		System.out.println(p1.equals(p2));
		System.out.println(p1.getProductName());



		System.out.println("....................................");
		ProductRecord r1 = new ProductRecord(999, "Laptop");
		System.out.println(r1);
		ProductRecord r2 = new ProductRecord(999, "Laptop");
		System.out.println(r1.equals(r2));
		System.out.println(r1.productName());

	}

}
