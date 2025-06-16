package NOV_28;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Pune", "Maharashtra");
        Employee employee = new Employee(101, "Abhishek Kumar", address);

        System.out.println(employee); // uses Employee's toString()
    }
}
