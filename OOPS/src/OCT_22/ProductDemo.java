package OCT_22;

import java.util.Scanner;

public class ProductDemo {
	public static void main(String[] args) {
		
		Product laptop = new Product();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the laptop Brand: ");
		laptop.laptopBrand =sc.nextLine();
		
		System.out.println("Enter the laptop price: ");
		laptop.laptopPrice = sc.nextDouble();
		
		System.out.println("Is the touch Screen Laptop: ");
		laptop.isTouchScreen =sc.nextBoolean();
		
		laptop.getLaptopInformation();
		sc.close();
	}

}
