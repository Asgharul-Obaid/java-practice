package com.java8;
interface Add{
	 int sum(int a,int b);
	 
	 default void Obaid1() {
		 Obaid() ;
		 System.out.println("HI");
	 }
	 private void Obaid() {
		 System.out.println("Private");
	 }
}
public class LamdaProgram {
	
public static void main(String[] args) {
	Add add=(a,b)->a+b;
		System.out.println(add.sum(10, 10));
		add.Obaid1();
		
	}
}

