package com.basicjava;
class Demo1234{
	int a;
	String name;
	static int c=10;
	
	public Demo1234(int a,String name) {
	a=a;
	name=name;
	System.out.println(a+":"+name);
	}	
}
public class PracticeProgram123 {
public static void main(String[] args) {
	int a=102;
	Demo1234 d=new Demo1234(101, "Obaid");
	System.out.println(Demo1234.c+" "+a);
	
}
}
