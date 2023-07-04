package com.basicjava;
class Fruit{
	String color;
	int type;
}


public class CalledbyRefenceVarieble {
public static void main(String arg[]) {
	Fruit a=new Fruit();
	a.color="red";
	a.type=10;
	System.out.println("Color of animal :"+ a.color   + " "+ "age of animal :" + a.type );
}
}
