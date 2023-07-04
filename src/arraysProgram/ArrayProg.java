package arraysProgram;

public class ArrayProg {
public static void main(String[] args) {
	int[] arr= {12,13,14,15,16,17,18};
	System.out.println("Input Array");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println("\nAfter reverse");
	for (int i = arr.length-1; i >=0; i--) {
		System.out.print(arr[i]+" ");
	}
}
}
