package com.basicjava.copy;

class ConstructorClass{
	int id;
	String name;
	
	ConstructorClass(int id,String name){
		this.id=id;
		this.name=name;
	}
	void Display() {
		System.out.println(this.id +":"+ this.name );
	}
	public static void main(String[] args) {
		ConstructorClass constructorClass = new ConstructorClass(12, "OK");
	 constructorClass.Display();
	}
}