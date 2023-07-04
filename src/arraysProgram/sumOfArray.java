package arraysProgram;

 
 public class sumOfArray {
	 public static void sumArray(int arr[]) {
		 int sum=0;
		 for(Integer i:arr) {
			sum=sum+i;
			System.out.println(sum);
		}
	}
	 public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		sumArray(arr);
	}
 }