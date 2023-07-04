package arraysProgram;

public class ReverseArray {
public static void main(String[] args) {
	int[] arr= {12,34,22,11};
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
	System.out.println("\n Arrays Reverse element");
	for (int i = arr.length-1; i > 0; i--) {
		System.out.println(arr[i]+" ");
	}
	

}
}