package com.basicjava.copy;
class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void info() {
		System.out.print(this.name+" "+this.age);
		//System.out.println(this.age);
	}
}
public class ObjectandClass {
	public static void main(String arg[]) {
		Student s1=new Student("Obaid",32);
		s1.info();
	}

}
