package com.java8;

import java.util.function.Supplier;

public class SupplierPractice {
	/*public String get() {
		return ("hello Obaid");
	}
	
	public static void main(String[] args) {
		Supplier<String>supplier=(Supplier<String>) new SupplierPractice();
		System.out.println(supplier.get());
		
	}*/
	
	public static void main(String[] args) {
		Supplier<String>supplier=()->{
			return "hello Obaid";
		};
	}
}
