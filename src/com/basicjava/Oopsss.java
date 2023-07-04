package com.basicjava;

class Animal {
	String name;
	int age;

	public void getInfo() {
		System.out.println("name of animal " + this.name);
		System.out.println("age of animal " + this.age);
	}
}

public class Oopsss {
	public static void main(String arg[]) {
		Animal a1 = new Animal();
		a1.name = " dog";
		a1.age = 2;
		a1.getInfo();

		Animal A2 = new Animal();
		A2.name = "human";
		A2.age = 60;
		A2.getInfo();

	}
}