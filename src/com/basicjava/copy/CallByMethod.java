package com.basicjava.copy;
class Methods{
	String color;
	int age;
	
	void input(String color,int age) {
		this.color=color;
		this.age=age;
	}
	void display() {
		System.out.println(color + " " + age);
	}
}

public class CallByMethod {
public static void main(String arg[]) {
	Methods m1=new Methods();
	m1.input("green", 12);
	m1.display();
}
}
