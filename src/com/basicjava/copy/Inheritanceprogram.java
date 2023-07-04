package com.basicjava.copy;
class Shape{
	public void area() {
		System.out.println("display area");
	}	
}
class Traingle extends Shape{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
	class Circle extends Shape{
		public void area(int r){
			System.out.println((3.14)*r*r);
		}
	}
public class Inheritanceprogram {
public static void main(String arg) {
	Circle c=new Circle ();
	c.area(2);
	c.area();
	c.area(3*2);
}
}
