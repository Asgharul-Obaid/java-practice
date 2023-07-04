package arraysProgram;

import java.util.Arrays;

public class AccendingOrding {

	public static void main(String[] args) {
		int a[] = { 21, 43, 54,54, 1, 42 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
           for (int j = 0; j < a.length-1; j++) {
			if (a[i]!=a[j]) {
				System.out.println();
			}
		}
			
		}

//		int index = 0;
//		for (int i = 0; i < a.length; i++) {
//			index = i;
//			for (int j = 0; j < a.length - 1; j++) {
//				if (a[j] > a[index]) {
//					index = j;
//				}
//				int temp = a[i];
//				a[i] = a[index];
//				a[index] = temp;
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

	}

}
