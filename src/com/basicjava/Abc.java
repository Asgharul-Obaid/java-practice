package com.basicjava;

public class Abc {
	public static void main(String[] args) {

		int a = 10, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);
			System.out.println("222");
		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | ArithmeticException ar) {
			ar.printStackTrace();
			System.out.println("yiiwjnm");
		}

	}
}
