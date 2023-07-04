package arraysProgram;

public class ArrayProgr {
public static void main(String[] args) {
	Object[] a= {1,3,4,5,7,88,15,21,6};
	for (int i = 0; i < a.length; i++) {
		
		int array = (int)a[i];
		
		if (array % 3 == 0) {
			a[i] = "Buzz";
		}
		if(array % 5 == 0) {
			a[i] = "Fizz";
		}
		if(array % 3 == 0 && array % 5 == 0) {
			a[i] = "FizzBuzz";
		}
	}
	
	for(Object array : a) {
		System.out.println(array);
	}
}
}
