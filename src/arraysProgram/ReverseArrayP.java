package arraysProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseArrayP {
public static void main(String[] args) throws IOException {
	int[] a=new int [5];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
	System.out.print("Original arrays");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("reverse arrays");
	for (int i = a.length-1; i>=0; i--) {
		System.out.print(a[i]+" ");
	}
}
}
