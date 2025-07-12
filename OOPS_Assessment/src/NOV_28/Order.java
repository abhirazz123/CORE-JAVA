package NOV_28;

public class Order {
	private int orderId;
	private String itemNam;
	private double itemPrice;

	public Order(int orderId, String itemNam, double itemPrice) {
		this.orderId = orderId;
		this.itemNam = itemNam;
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemNam=" + itemNam + ", itemPrice=" + itemPrice + "]";
	}

}
