package JAN_05.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignment extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name != null && name.equalsIgnoreCase("Placement")) {
			placementBatch();
		} else if (name != null && name.equalsIgnoreCase("Regular")) {
			regularBatch();
		} else {
			throw new NullPointerException("Name can't be null or unsupported batch type");
		}
	}

	public void placementBatch() {
		System.out.println("I am a placement batch student.");
	}

	public void regularBatch() {
		System.out.println("I am a Regular batch student.");
	}
}

public class ThreadName2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (sc) {
			System.out.print("Enter Your Batch Title (Placement/Regular): ");
			String title = sc.next();
			BatchAssignment b = new BatchAssignment();
			b.setName(title);  // Set the name of the thread
			b.start();         // Start the thread (invokes run())
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");
		}
	}
}
