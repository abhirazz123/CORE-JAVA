package Assignment.OCt_07;

public class CycleSellingPriceCalculator {
	public static void main(String[] args) {

		double purchaseCost = 1200.0;
		double repairCost = 250.0;
		double coloringCost = 350.0;
		double accessoriesCost = 500.0;
		double desiredProfit = 1500.0;


		double totalCost = purchaseCost + repairCost + coloringCost + accessoriesCost;
		double sellingPrice = totalCost + desiredProfit;


		System.out.printf("Purchase Cost: Rs. %.2f%n", purchaseCost);
		System.out.printf("Repair Cost: Rs. %.2f%n", repairCost);
		System.out.printf("Coloring Cost: Rs. %.2f%n", coloringCost);
		System.out.printf("Accessories Cost: Rs. %.2f%n", accessoriesCost);
		System.out.printf("Total Cost Incurred: Rs. %.2f%n", totalCost);
		System.out.printf("Desired Profit: Rs. %.2f%n", desiredProfit);
		System.out.printf("Selling Price: Rs. %.2f%n", sellingPrice);
	}
}
