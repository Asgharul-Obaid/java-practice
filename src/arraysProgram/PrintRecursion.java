package arraysProgram;

public class PrintRecursion {
	public static void sortingArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}	
	}
	public static void main(String[] args) {
		int[] a= {7,3,4,1,5,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int obaid=a[j];
					a[j]=a[j+1];
					a[j+1]=obaid;
				}
			}
		}
		sortingArray(a);
	}
}


