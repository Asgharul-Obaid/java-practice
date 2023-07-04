package com.basicjava;

public class InstanceInitializerBlock {
	String name;
	InstanceInitializerBlock(){
		System.out.println("Name is "+name);
	}
	{
		name="Obaid";
	}
	public static void main(String arg[]) {
		InstanceInitializerBlock in=new InstanceInitializerBlock();
	}

}
