package OCt_22;

import java.util.Scanner;

public class Product {
	int ProductId;
	String ProductName;
	double ProductPrice;
	
	public void setProductData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Product Id: ");
		ProductId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enetr the Product Name : ");
		ProductName = sc.nextLine();
		
		System.out.print("Enter the Product Price: ");
		ProductPrice = sc.nextDouble();
	}
	public void getProductInfo(){
		System.out.println("productPrice = "+ProductId);
		 System.out.println("productPrice = "+ProductName);
		 System.out.println("productPrice = "+ProductPrice);
	}

}
