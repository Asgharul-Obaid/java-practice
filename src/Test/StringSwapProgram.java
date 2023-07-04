package Test;

public class StringSwapProgram {
	public static void sortingArray(int a[]) {
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j <a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int sufiyan=a[j];
					a[j]=a[j+1];
					a[j+1]=sufiyan;
				}
			}
			System.out.println(a[i]);
		}
		
	}
public static void main(String[] args) {
	int a[]= {4,2,1,3,7,6};
	sortingArray(a);
}
}
