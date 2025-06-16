package NOV_27;

import java.util.Scanner;

class Address {
	private String street;
	private String city;
	
	public Address(String street, String city) {
		this.street = street;
		this.city = city ;
		
	}
	public String getStreet() {
		return street;
		
	}
	public String getCity() {
		return city;
		
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	

}
class Person {
	private String name;
	private Address address;
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	
}
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("any added, like house number: ");
		int housenumber = sc.nextInt();
		sc.nextLine();
		
		if(housenumber<0) {
			System.out.println("Error Invalid Input");
		}else 
		{
			Address add = new Address("123 Elm Street", "Springfield");
			Person p = new Person("Abhi", add);
			System.out.println(p);
		}
	}

}
