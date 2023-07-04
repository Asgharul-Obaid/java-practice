package com.basicjava;
class Pen{
	String type;
	String color;

public void write() 
{
	System.out.println("witing something");
}

public void printColor() 
{
	System.out.println(this.color+ " "+ this.type);
}
}
public class ClassAndObjectProgram 
{
public static void main(String arg[]) 
{
	Pen p1=new Pen();
	p1.type="gel";
	p1.color="black";
	
	Pen p2=new Pen();
	p2.type="ballPoint";
	p2.color="blue";
	
	p1.printColor();
	p2.printColor();
	p1.write();
	
	}


}

