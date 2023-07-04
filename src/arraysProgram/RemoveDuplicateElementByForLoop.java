package arraysProgram;

public class RemoveDuplicateElementByForLoop {
public static void main(String[] args) {
	int[]array={1,2,1,2,3,4,5,5,6};
	int j=0;
	for (int i = 0; i < array.length-1; i++) {
		if (array[i]!=array[i+1]) {
			array[j]=array[i];
			j++;
		}
	}
	array[j]=array[array.length-1];
	for (int i = 0; i < j+1; i++) {
		System.out.println(array[i]);
		
	}
}
}
