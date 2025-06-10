package OCt_29;

public class InventoryItem {
	String itemName;
	double pricePerUnit;
	int quantityInStock ;

		public  InventoryItem (String itemName, double pricePerUnit, int quantityInStock) {
			if(itemName==null || itemName.trim().isEmpty()) {
				 System.out.println("Error: Invalid item name.");
				this.itemName ="Unknown";
			}
			else {
				this.itemName = itemName;
			}
			if(pricePerUnit<0) {
				System.out.println("Error: Invalid price.");
				this.pricePerUnit = 0.0;
			}else {
				this.pricePerUnit = pricePerUnit;
			}
			if(quantityInStock<0) {
				System.out.println("Error: Invalid quantity");
				this.quantityInStock = 0;
				
			}
			else {
				this.quantityInStock = quantityInStock;
			}
			
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public double getPricePerUnit() {
			return pricePerUnit;
		}

		public void setPricePerUnit(double pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
		}

		public int getQuantityInStock() {
			return quantityInStock;
		}

		public void setQuantityInStock(int quantityInStock) {
			this.quantityInStock = quantityInStock;
		}
		public double  calculateTotalValue() {
			return pricePerUnit *quantityInStock;
		}
		public void printDetails() {
			System.out.println("Iteam: "+ itemName);
			System.out.println("Totale value is Stock: "+ calculateTotalValue());
		}
		public static void main(String[] args) {
			 // Test Case 1
	        InventoryItem item1 = new InventoryItem("Apples", 10, 15);
	        item1.printDetails();

	        System.out.println();

	        // Test Case 2
	        InventoryItem item2 = new InventoryItem("Oranges", -5.0, 20);
	        item2.printDetails();

	        System.out.println();

	        // Test Case 3
	        InventoryItem item3 = new InventoryItem("Bananas", 5.0, -10);
	        item3.printDetails();

	        System.out.println();

	        // Test Case 4
	        InventoryItem item4 = new InventoryItem("", 8.0, 10);
	        item4.printDetails();
	        
	        
		}
}
