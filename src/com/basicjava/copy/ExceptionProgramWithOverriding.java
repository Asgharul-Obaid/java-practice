package com.basicjava.copy;

class A{
	void eating()
	{
		System.out.println("eating");
	}
}
class B extends A{
	void eating()throws ArithmeticException 
	{
		System.out.println("class B is eating");
	}
}

public class ExceptionProgramWithOverriding {
public static void main(String arg[]) {
	A a=new B();
	a.eating();
}
}
