package com.basicjava.copy;
class Home{
	String name;
	int age;
	
	Home(String name,int age){
    	this.name="iqra";
		this.age=12;
		System.out.println("COnstructor called");
	}
}
public class Constructor {
public static void main(String arg[]) {
	Home s=new Home ("iqra" ,12);
	
}
}
