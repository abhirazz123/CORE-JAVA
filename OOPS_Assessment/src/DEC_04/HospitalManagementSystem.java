package DEC_04;
class HospitalStaff{
	protected String name;
	private int age;
	protected String role;

	public HospitalStaff(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public void work() {
		System.out.println("Role Name is working");
	}

}
class Doctor extends HospitalStaff{
	private String specialization;
	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization =specialization;
	}
	public void work() {
		 System.out.println(role + " " + name + " with specialization in " + specialization + " is treating patients.");
	}
}
class Nurse extends HospitalStaff{
	private int yearsOfExperience;
	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience =yearsOfExperience;
	}
	public void work() {
		 System.out.println(role + " " + name + " with " + yearsOfExperience + " years of experience is taking care of patients.");
	}
}
class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor d = new Doctor("Alice", 40, "Doctor", "Cardiology");
        Nurse n = new Nurse("Bob", 35, "Nurse", 10);
        HospitalStaff h = new HospitalStaff("Charlie", 50, "Admin");

        d.work();
        n.work();
        h.work();
    }
}
