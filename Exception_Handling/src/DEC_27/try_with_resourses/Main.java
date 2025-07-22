package DEC_27.try_with_resourses;

public class Main {
	public static void main(String[] args) {
		DatabaseResourse dr = new DatabaseResourse();
		FileResourse fr = new FileResourse();
		 try (dr;fr){
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.err.println("Divide by zero problem ");
		}
		 System.out.println("Main method Completed!!");
	}
}
