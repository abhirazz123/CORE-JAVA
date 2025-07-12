package OCt_28;

public class Book {
	String title;
	String author;
	double price;

	public  Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void applyDiscount(double Discount){
		if(Discount<0) {
			System.out.println("Error: Invalid discount percentage");
		}else {
			double discountAmount = price * (Discount / 100);
            price = price - discountAmount;
		}
	}
	public void printDetails(){
		System.out.println("Book Title Name: "+ title);
		System.out.println("Book Author Name: "+ author);
		System.out.println("Book Priuce : "+price);
	}
	public static void main(String[] args) {
		Book book1 = new Book("1984", "George Orwell", 14.391);
        book1.applyDiscount(-10);
        book1.printDetails();

		System.out.println();

		Book book2 = new Book("Negative Price Book", "No Author", -5.0);
        book2.printDetails();


	}
}
