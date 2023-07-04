package arraysProgram;

import java.util.Scanner;

public class ArrayPractice {
	public static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;
		}
		System.out.println("Sum is :" + total);
	}

	public static void main(String arg[]) {
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter size of array length");
			int size = s.nextInt();
			int[] a = new int[size];
			System.out.println("ENTER ELEMENT");

			for (int i = 0; i < a.length; i++) {
				a[i] = s.nextInt();
			}
			ArrayPractice.sum(a);
			
			System.out.println("DO YOU EXECUTE AGAIN?    YES/NO");
		
			String executedOrNot = s.next();
			if (!executedOrNot.equalsIgnoreCase("yes")) {
				System.out.println("Execution is Terminated & Thanks !!");
				break;
			}
		}
	}
}