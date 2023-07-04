package problem_solving;

public class SortingArrays {
	public static void sortingArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
public static void main(String[] args) {
	int arr[]= {9,1,6,3,7,4};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if (arr[j]>arr[j+1]) {
				int tem=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;
			}
		}
	}
	sortingArray(arr);
}
}
