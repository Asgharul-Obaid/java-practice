package arraysProgram;

public class SumOfArrays {
	public static void main(String[] args) {
		int a[] = { 5, 2, 9, 7, 6 };

		int sum = 0;
		// for loop

		/*
		 * for (int i = 0; i < a.length-1; i++) { sum=sum+a[i]; }
		 * System.out.println("sum of array element:"+sum);
		 */
		// for eachloop

		for (int s : a) {
			sum = sum + s;
		}

		System.out.println("sum of array element:" + sum);

	}
}