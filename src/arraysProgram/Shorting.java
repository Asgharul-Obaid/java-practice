package arraysProgram;

public class Shorting {
public static void printNumber(int n[]) {
	for (int i = 0; i < n.length; i++) {
		System.out.print(n[i]+" ");	
	}
}
public static void main(String[] args) {
	int[] n= {9,8,7,10,3,2,2};
	for (int i = 0; i < n.length; i++) {
		for (int j = 0; j < n.length-1-i; j++) {
			
			if (n[j]>n[j+1]) {
				int temp=n[j];
				n[j]=n[j+1];
				n[j+1]=temp;
			}
		}
	}
	printNumber(n);
}
}
