package com.basicjava;
class Human{
	String name;
	int age;
	
	void home(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println(name+ " "+ age);
	}
}
public class Oops{
	public static void main(String arg[]) {
		Human h=new Human();
		h.home("Obaid", 12);
	}
}

