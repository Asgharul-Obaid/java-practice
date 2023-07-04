package com.basicjava.copy;

public class Demo {
int a;
Demo(int a){
	this.a=a;
	//System.out.println(a);
}
void m1() {
	System.out.println(a);
}
public static void main(String[] args) {
	Demo demo=new Demo(10);
	demo.m1();
}
}
