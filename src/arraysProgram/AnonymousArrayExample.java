package arraysProgram;

import java.util.Scanner;

public class AnonymousArrayExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		System.out.print("Enter the array elements: ");
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		printArray(numbers);

		int sum = calculateSum(numbers);

		System.out.println("Sum: " + sum);

		scanner.close();
	}
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}
}
