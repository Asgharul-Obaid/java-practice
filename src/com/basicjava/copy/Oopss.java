package com.basicjava.copy;

class Students{
	String name;
	int age;
	
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Students(Students s2){
		this.name=s2.name;
		this.age=s2.age;
				
	}
	Students(){
		
	}
}

public class Oopss {
	public static void main(String arg[]) {
		Students s1=new Students();
		s1.name="iqra";
		s1.age=12;
		Students s2=new Students(s1);
		s2.printInfo();
		
		s1.printInfo();
	}

}
