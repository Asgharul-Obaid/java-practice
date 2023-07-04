package com.java8;

interface Ahmed{
	int sum(int a,int b);
	default void show() {
		System.out.println("Ahmed Zaki");
		zaki();
	}
	static void show1() {
		System.out.println("Don");		
	}
	private void zaki() {
		System.out.println("Zaki Ahmed");
	}	
}
public class ZakiLambda {
	public static void main(String[] args) {

		Ahmed ah=(a,b)-> a+b;
		System.out.println(ah.sum(10, 20));
		ah.show();
		Ahmed.show1();
	}
}
