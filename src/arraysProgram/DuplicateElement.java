package arraysProgram;

import java.util.HashSet;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[] = { 1,1,2,2,3,3,4,5,6,5};
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (Integer integer : hs) {
			System.out.print(integer+" ");
			
		}
	}

}