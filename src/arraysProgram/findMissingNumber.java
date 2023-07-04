package arraysProgram;

import java.util.Arrays;

public class findMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 50, 75};
		Arrays.sort(arr);
		int sum = 0;
		int sum1 = 0;
		for (int total = 0; total <= arr.length - 1; total++) {
			sum += arr[total];
		}
		for (int index = 1; index <= arr.length; index++) {
			sum1 = sum + index;
		}
		System.out.println(sum1 - sum);
	}
}