package JAN_06;
class InsufficientQuantityException extends Exception{
	InsufficientQuantityException(String  messages){
		super(messages);
	}
}
class InvalidProductException extends Exception{
	InvalidProductException(String messages){
		super(messages);
	}
}
class Product {
	private int id;
	private String Name;
	private double ProductPrice;
	private int quantity;
	Product (int id, String Name, double ProductPrice, int quantity){
		this.id = id;
		this.Name = Name;
		this.ProductPrice = ProductPrice;
		this.quantity = quantity;
		
	}
	public void decreaseQuantity (int amount) throws InsufficientQuantityException {
		if(amount>quantity) {
			throw new InsufficientQuantityException("Requested quantity " + amount + " exceeds available quantity " + quantity + " for product " + Name);
		}
		quantity -= amount;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
}
class ShoppingCart {
	private Product[] cartItems;
	private int itemCount;
	
	public ShoppingCart(int capacity ) {
		cartItems = new Product[capacity]; 
		itemCount = 0;
	}
	public void addToCart (Product product, int quantity) throws InvalidProductException, InsufficientQuantityException {
		if(product == null) {
			throw new InvalidProductException("Product is not found in inventory.");
		}
		if(itemCount>=cartItems.length) {
			throw new InvalidProductException("Cart is full. Cannot add more products.");
		}
		product.decreaseQuantity(quantity);
		cartItems[itemCount++] = new Product(product.getId(), product.getName(), product.getProductPrice(), product.getQuantity());
	}
	public double calculateTotal() {
		double total = 0.0;
		for(int i = 0; i<itemCount; i++) {
			total += cartItems[i].getProductPrice();
		}
		return total;
	}
}


public class ShoppingApplication {
    public static void main(String[] args) {
       
        Product apple = new Product(1, "Apple", 10.0, 50);
        Product banana = new Product(2, "Banana", 5.0, 30);
        Product orange = new Product(3, "Orange", 8.0, 20);
        Product invalidProduct = null; 

       
        ShoppingCart cart = new ShoppingCart(3);

        try {
           
            cart.addToCart(apple, 5); 
            cart.addToCart(banana, 10); 

            
            cart.addToCart(orange, 25); 
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
   
            cart.addToCart(invalidProduct, 2);
        } catch (InvalidProductException | InsufficientQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
           
            cart.addToCart(orange, 10); 
            cart.addToCart(apple, 1); 
        } catch (InsufficientQuantityException | InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        }

      
        double total = cart.calculateTotal();
        System.out.println("Total Price of Cart: ₹" + total);
    }
}
