package arraysProgram;

public class BubbleShortDemo {
	public static void main(String arg[]) {
		int[] a = { 36, 19, 29, 12, 5 };
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1-i; j++) {
				if (a[j] > a[j + 1]) {
				int	temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
