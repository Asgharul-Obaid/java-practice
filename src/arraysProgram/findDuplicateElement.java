package arraysProgram;

public class findDuplicateElement {
	
	public static void sortingArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,1,5,2,4};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int sorting =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=sorting;
				}
			}
		}
		sortingArray(arr);
	}
}
