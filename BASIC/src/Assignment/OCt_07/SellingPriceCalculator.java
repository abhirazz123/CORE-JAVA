package Assignment.OCt_07;

public class SellingPriceCalculator {
	public static void main(String[] args) {
		double costPrice = 32500.0;
		double profitPercent = 27.0;
		double vatPercent = 12.7;
		double serviceChargePercent = 3.87;


		double profit = costPrice * (profitPercent / 100);
		double sellingPriceExclVAT = costPrice + profit;
		double vat = sellingPriceExclVAT * (vatPercent / 100);
		double serviceCharge = sellingPriceExclVAT * (serviceChargePercent / 100);
		double totalSellingPrice = sellingPriceExclVAT + vat + serviceCharge;

		System.out.printf("Profit: Rs. %.2f%n", profit);
		System.out.printf("Selling Price (Excluding VAT and Service Charge): Rs. %.2f%n",   sellingPriceExclVAT);
		System.out.printf("VAT: Rs. %.2f%n", vat);
		System.out.printf("Service Charge: Rs. %.2f%n", serviceCharge);
		System.out.printf("Total Selling Price: Rs. %.2f%n", totalSellingPrice);
	}
}
