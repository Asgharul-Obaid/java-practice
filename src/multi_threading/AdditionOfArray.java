package multi_threading;

import java.util.Scanner;

public class AdditionOfArray {
	
public static void sum(int[] a) {
		
		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		System.out.println("Sum is :" + total);
	}	
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array");
		int a=s.nextInt();
	}
	
}