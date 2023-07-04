package arraysProgram;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int sum=0;
		int arr[]= {1,3,2,4};
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}