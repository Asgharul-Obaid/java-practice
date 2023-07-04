package arraysProgram;

import java.util.Scanner;

public class SumArray {
public static void main(String[] args) {
	System.out.println("enter element");
	int[] array= new int[5];
	int sum=0;
	for(int i:array) {
		sum=sum+i;
	}
	System.out.println(sum);
}
}
