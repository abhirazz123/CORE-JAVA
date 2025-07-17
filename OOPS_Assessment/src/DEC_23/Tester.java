package DEC_23;

import java.util.Scanner;
import java.util.function.UnaryOperator;

class ClassRoom {
	private int chairs;

	public ClassRoom(int chairs) {
		this.chairs = chairs;
	}
	public int getChairs() {
		return chairs;
	}
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	@Override
	public String toString() {
		return "ClassRoom [chairs=" + chairs + "]";
	}
	public static UnaryOperator<ClassRoom> adjustChairs() {
		return room->{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number of Student: ");
			int studentCount = sc.nextInt();

			if(studentCount>room.chairs) {
				System.out.println("Not enough chairs! Adding more.");
				room.setChairs(studentCount);

			}else if(studentCount<room.getChairs()){
				System.out.println("Too many chairs! Removing extras");
				room.setChairs(studentCount);

			}else {
				System.out.println("Chairs are already enough.");
			}
			return room;
		};
	}
}
public class Tester {
	public static void main(String[] args) {
		ClassRoom room = new ClassRoom(100);
		System.out.println("Initial Classroom: "+room);

		UnaryOperator<ClassRoom>adjuster = ClassRoom.adjustChairs();
		ClassRoom updatedRoom = adjuster.apply(room);

		System.out.println("Updated Classroom: " + updatedRoom);
	}
}