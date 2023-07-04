package arraysProgram;

public class FindMissingNumberPro {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int temp[] = new int[arr.length + 1];
		int a2 = 0;

		for (int i = 0; i < temp.length - 1; i++) {
			temp[i] = 0;
			temp[arr[i] - 1] = 1;
		}
		for (int j = 0; j < temp.length - 1; j++) {
			if (temp[j] == 0) {
				a2 = j + 1;
				System.out.print(a2);
			}
		}

	}
}
