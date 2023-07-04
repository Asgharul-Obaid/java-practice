package com.basicjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddWithSwitchCase {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Number");
	int number =0;
	number=Integer.parseInt(br.readLine());
	switch (number%2) {
	case 0: {
		
		System.out.println("even");
		break;
	}
	case 1:{
		System.out.println("odd");
		break;
	}
}
}
}