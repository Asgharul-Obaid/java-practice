package arraysProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RightRotateRotateArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many elemnt do u want left rotate?");
		int numOfRotate = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < numOfRotate; i++) {
			int temp = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
