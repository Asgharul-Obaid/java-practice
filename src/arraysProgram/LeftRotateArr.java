package arraysProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeftRotateArr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements do you want to left rotate?");
		int numOfRotate = Integer.parseInt(br.readLine());
		
		numOfRotate = numOfRotate % a.length;
		int rotatedArray[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int rotatedIndex = (i + numOfRotate) % a.length;
			rotatedArray[i] = a[rotatedIndex];
		}
		System.out.println("Left-rotated array: " + Arrays.toString(rotatedArray));
	}
}
