package com.basicjava;

import java.util.Scanner;

public class EvenOddProblem {
public static void main(String[] args) {
	String array[]= {"Even","Odd"};
	Scanner s=new Scanner(System.in);
	System.out.println("enter element");
	int a=s.nextInt();
	System.out.println(array[a%2]);
}
	
}

