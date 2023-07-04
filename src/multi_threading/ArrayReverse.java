package multi_threading;

public class ArrayReverse {
	public static void main(String arg[]) {
		int[] a = { 13, 21, 14, 11, 6 };
		int res;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length-1 ; i++) {
				if (a[j] > a[j+1]) {
					res = a[j];
					a[j] = a[j + 1];
					a[j + 1] = res;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}
}
