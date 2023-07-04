package com.basicjava;

//WAP to show addition and multiplication using Interface?
interface Add{
	void addition(int a,int b);

}
interface mul{
	void multip(int a,int b);

}

public class AddMul implements Add,mul {

	@Override
	public void multip(int a, int b) {
		System.out.println("Multiplication of two number :"+(a*b));
		
	}

	@Override
	public void addition(int a, int b) {
		System.out.println("Addition of two number:"+(a+b));
		
	}

	public static void main(String[] args) {
		AddMul addMul = new AddMul();
		addMul.addition(2, 5);
		addMul.multip(3, 2);
	}

}
