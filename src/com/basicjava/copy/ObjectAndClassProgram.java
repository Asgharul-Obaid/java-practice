package com.basicjava.copy;

class Car{
	String color;
	Car(String color){
		this.color = color;
	}
void Show() {
	System.out.println("Color of car" + this.color);
}
}
public class ObjectAndClassProgram {
public static void main(String arg[]) {
	Car c=new Car("black");
	c.color= "Red";
	c.Show();
}
}
