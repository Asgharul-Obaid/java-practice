package com.basicjava.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiOfTwoWithoutOper {
public static void main(String[] args) throws IOException {
	int a,b,obaid=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter two number");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	for(int i=1; i<=a;i++) {
		obaid=obaid+b;
	}
	System.out.println("the Multiplication pof two number"+obaid);
}
}
