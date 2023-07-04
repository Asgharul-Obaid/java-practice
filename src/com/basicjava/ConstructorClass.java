package com.basicjava;

class ConstructorClass1{
	int id;
	String name;
	
	ConstructorClass1(int id,String name){
		this.id=id;
		this.name=name;
	}
	void Display() {
		System.out.println(this.id +":"+ this.name );
	}
	public static void main(String[] args) {
		ConstructorClass1 constructorClass = new ConstructorClass1(12, "ok");
	 constructorClass.Display();
	}
}