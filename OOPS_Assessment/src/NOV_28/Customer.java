package NOV_28;

public class Customer {
	private int CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private Order order;
	
	public  Customer(int CustomerId, String CustomerName, String CustomerAddress, Order order) {
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName ;
		this.CustomerAddress = CustomerAddress;
		this.order = order;
	}

	  @Override
	    public String toString() {
	        return "Customer [Customer ID: " + CustomerId +
	               ", Name: " + CustomerName +
	               ", Address: " + CustomerAddress + "]\n" + order;
	    }
	}