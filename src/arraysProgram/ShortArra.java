package arraysProgram;

public class ShortArra {
	public static void shorting(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	int arr[]= {13,3,2,6,1};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1-i; j++) {
			if (arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	shorting(arr);
}
}
