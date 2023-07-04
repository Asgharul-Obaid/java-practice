package com.basicjava.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchProgram {
public static void main(String[] args) throws IOException {
	int a,b;
	String sum;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter two numbers");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	sum=br.readLine();
	
	switch (sum) {
	case "+": 
	    System.out.println("Addition of two Number :" +(a+b));
		break;
		
	case "-":
		System.out.println("Subtraction of two number :"+ (a-b));
	    break;
	    
	case "/":
		System.out.println("Division of two number :" +(a/b));
		break;
		
	case "*":
	    System.out.println("Multiplication of two number :"+(a*b));
	    break;
	    
	default:
		System.out.println("wrong operator........");
	}
	
}

}
