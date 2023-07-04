package com.java8;

interface MultiParameterFunctionalInterface{
	int sum(int a, int b);
}
public class MultiParaFunctionalInterfaceMain {
public static void main(String[] args) {
	
	MultiParameterFunctionalInterface mpfi=(a,b)->{
		if (b>a) {
			throw new RuntimeException("b should not or greater than or equal to a");
			
		}
		return a+b;
	};
	System.out.println(mpfi.sum(10, 99));
}
}
