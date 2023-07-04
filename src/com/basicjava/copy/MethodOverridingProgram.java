package com.basicjava.copy;
class Anima{
	void show() {
		System.out.println("i am meyau");
	}
}
class Cat extends Anima{
	void show() {
		//super.show();
		System.out.println("bhoo bhoo");
		System.out.println();
	}
	}
public class MethodOverridingProgram{
	public static void main(String[] args) {
		Anima c=new Cat();
		c.show();
		System.out.println();
	}

}

