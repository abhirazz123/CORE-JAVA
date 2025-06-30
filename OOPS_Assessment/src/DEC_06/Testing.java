package DEC_06;
abstract  class Book{
	protected String title ;

	abstract void setTitle(String titale);

	String getTitle() {
		return title;

	}
}
class MyBook extends Book {

	@Override
	void setTitle(String titale) {
		this.title =titale;

	}
	public String getTitle() {
		return "The title of my book is: "+ title;

	}

}

public class Testing {
	public static void main(String[] args) {
		MyBook book = new MyBook();
		book.setTitle("A tale of two cities");
		System.out.println(book.getTitle());
	}

}
