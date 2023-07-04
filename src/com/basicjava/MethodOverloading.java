package com.basicjava;
class Overloading{
	String name;
	int age;
	
	public void display(String name) {
		System.out.println(name);
	}
	public void display(int age) {
		System.out.println(age);
	}
	public void display(String name,int age) {
		System.out.println(name+" "+age);
	}
}
public class MethodOverloading {
public static void main(String arg[]) {
	Overloading o=new Overloading();
	o.name="obaid";
	o.age=32;
	o.display(32);
	o.display("obaid");
	o.display("sabbu", 32);
	}
}
